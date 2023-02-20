package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.school.view.GenerateGradeDisplay;
import kr.co.ezenac.project.utils.Define;

public class UiMain {

	School gangnamschool = School.getInstance();
	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();
	Subject science;
	Subject math;
	Subject fencing;
	
	public static void main(String[] args) {
		UiMain uimain = new UiMain();
		
		uimain.createSubject();
		uimain.createStudent();
		
		
		String display = uimain.gradeDisplay.getDisplay();
		System.out.println(display);
	}

	public void createStudent() {
		Student student1 = new Student(202301, "나희도", science);
		Student student2 = new Student(202302, "백이진", math);
		Student student3 = new Student(202303, "고유림", science);
		Student student4 = new Student(202304, "문지웅", math);
		Student student5 = new Student(202305, "지승완", math);
		
		gangnamschool.addStudent(student1);
		gangnamschool.addStudent(student2);
		gangnamschool.addStudent(student3);
		gangnamschool.addStudent(student4);
		gangnamschool.addStudent(student5);
		
		
		//수강신청
		science.subjectEnrolment(student1);
		science.subjectEnrolment(student2);
		science.subjectEnrolment(student3);
		science.subjectEnrolment(student4);
		science.subjectEnrolment(student5);
		
		math.subjectEnrolment(student1);
		math.subjectEnrolment(student2);
		math.subjectEnrolment(student3);
		math.subjectEnrolment(student4);
		math.subjectEnrolment(student5);
		
		fencing.subjectEnrolment(student1);
		fencing.subjectEnrolment(student2);
		fencing.subjectEnrolment(student3);
		
		//과목별 성적
		addScoreForStudent(student1, science, 84);
		addScoreForStudent(student1, math, 67);
		addScoreForStudent(student1, fencing, 89);
				
		addScoreForStudent(student2, science, 97);
		addScoreForStudent(student2, math, 100);
		addScoreForStudent(student2, fencing, 65);
				
		addScoreForStudent(student3, science, 88);
		addScoreForStudent(student3, math, 67);
		addScoreForStudent(student3, fencing, 97);
				
		addScoreForStudent(student4, science, 87);
		addScoreForStudent(student4, math, 95);
				
		addScoreForStudent(student5, science, 96);
		addScoreForStudent(student5, math, 100);

		
		
	}

	private void addScoreForStudent(Student student, Subject subject, int score) {
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
		
	}

	public void createSubject() {
		science = new Subject("과학", Define.SCIENCE);
		math = new Subject("수학", Define.MATH);
		fencing = new Subject("펜싱", Define.FENCING);
		
		fencing.setGradetype(Define.PF_TYPE);
		
		gangnamschool.addSubject(science);
		gangnamschool.addSubject(math);
		gangnamschool.addSubject(fencing);
		
	}
}
