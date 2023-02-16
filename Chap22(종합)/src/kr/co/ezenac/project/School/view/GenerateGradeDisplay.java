package kr.co.ezenac.project.School.view;


import java.util.ArrayList;

import kr.co.ezenac.project.School.School;
import kr.co.ezenac.project.School.Score;
import kr.co.ezenac.project.School.Student;
import kr.co.ezenac.project.School.Subject;
import kr.co.ezenac.project.grade.BasicEvaluation;
import kr.co.ezenac.project.grade.GradeEvaluation;
import kr.co.ezenac.project.grade.MajorEvaluation;
import kr.co.ezenac.project.grade.PassFailEvaluation;
import kr.co.ezenac.project.utils.Constants;

public class GenerateGradeDisplay {

	School school = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "---------------------------------------------------\n";
	public static final String HEADER = "이름\t 	   학번\t   	필수 \t점수     학점\n";
	public static final String LINE2 = "===================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
	}
	
	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();
		
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		
		return buffer.toString();
	}

	private void makeFooter(Subject subject) {
		buffer.append(GenerateGradeDisplay.LINE2);
		buffer.append("\n");
		
	}

	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			
			buffer.append(student.getStudentId());
			buffer.append("\t");
			
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t");
			
			getScoreGrade(student, subject); 				//학생별 해당과목 학점 계산
			
			buffer.append("\n");
		}
		
	}

	private void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();
		
		//학점 평가 클래스들
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
		
		//학생이 가진 점수들
		for(int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i);
			//현재 학점을 산출할 과목
			if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;
				
				if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
					if(score.getSubject().getGradeType() == Constants.PF_TYPE) {
						grade = gradeEvaluations[Constants.PF_TYPE]
													.getGrade(score.getScore());
					}else {
						
						if(score.getSubject().getSubjectId() == majorId)		// 전공과목인 경우
							grade = gradeEvaluations[Constants.SAB_TYPE]		// 전공과목 학점 평가
														.getGrade(score.getScore());
						else
							grade = gradeEvaluations[Constants.AB_TYPE]			// 전공과목 아닌 학점 평가
														.getGrade(score.getScore());
						
					}
					
					buffer.append(score.getScore());
					buffer.append("\t");
					buffer.append(grade);
				}
				
				

			}
		}
	}
	
}





















