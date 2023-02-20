package kr.co.ezenac.project.school.view;

import java.util.ArrayList;



import kr.co.ezenac.project.grade.BasicScoreEvaluation;
import kr.co.ezenac.project.grade.GradeScoreEvaluation;
import kr.co.ezenac.project.grade.MajorScoreEvaluation;
import kr.co.ezenac.project.grade.PassFailEvaluation;
import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.utils.Define;


public class GenerateGradeDisplay {

	School school = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "-------------------------------------------\n";
	public static final String HEADER = "이름\t 	 학번\t필수 \t점수     학점\n";
	public static final String LINE2 = "===========================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
	}
	public String getDisplay () {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		return buffer.toString();
	}
	
	public void makeFooter(Subject subject) {
		buffer.append(GenerateGradeDisplay.LINE2);
		buffer.append("\n");
		
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			}else {
				buffer.append("\t\t");
			}
			
			buffer.append(student.getStudentName());	//이름 출력
			buffer.append("\t");
			
			buffer.append(student.getMajorSubject().getSubjectName());	//학과이름 출력
			buffer.append("\t");
			
			getScoreGrade(student, subject);			//개별 해당과목 채점
			
			buffer.append("\n");
		}
	}
	private void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();
		int majorNumber = student.getMajorSubject().getSubjectNumber();
		
		//학점 평가하는 클래스들
		GradeScoreEvaluation[] gse = {new BasicScoreEvaluation(), new MajorScoreEvaluation(), new PassFailEvaluation()};
		
		//학생들이 가진 점수들
		for(int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i);
			
			//현재 학점을 산출할 과목
			if(score.getSubject().getSubjectNumber() == subject.getSubjectNumber()) {
				String grade;
				
				if(score.getSubject().getSubjectNumber() == subject.getSubjectNumber()) {
					if(score.getSubject().getGradetype() == Define.PF_TYPE) {
						grade = gse[Define.PF_TYPE]
								.getGrade(score.getPoint());
					}else {
						if(score.getSubject().getSubjectNumber() == majorNumber)		// 전공과목인 경우
							grade = gse[Define.SF_TYPE]		// 전공과목 학점 평가
														.getGrade(score.getPoint());
						else
							grade = gse[Define.AF_TYPE]			// 전공과목 아닌 학점 평가
														.getGrade(score.getPoint());
					}
					buffer.append(score.getPoint());
					buffer.append("\t");
					buffer.append(grade);
				}
			}
		}
	
	
	}
}


























