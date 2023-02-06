package ko.co.ezenac.arraylist;

import java.util.ArrayList;



/*
 * 	학생 2명
 * 	- 학생1은 2과목 수강,
 *  - 학생2는 3과목 수강
 *  - ArrayList를 활용하여 두 학생의 과목성적과 총점을 출력하시오.
 */
public class Student {
	
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName= studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);		
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생 " + this.studentName + "의 " + 
			                    subject.getName()+ "과목 성적은 " + 
					            subject.getScorePoint() + "입니다");
		}
		System.out.println("학생 " +this.studentName + "의 총점은 "+
		                   +total+ "점 입니다.");
	}
	
}
























