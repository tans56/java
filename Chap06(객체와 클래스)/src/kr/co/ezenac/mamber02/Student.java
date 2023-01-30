package kr.co.ezenac.mamber02;

public class Student {
	int studentId;
	String studentName;
	int grade;
	
	public Student(int studentId, String studentName, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName +" 학생의 학번은"+ studentId+ "이고, " + grade + "학년 입니다.";
	}
}
