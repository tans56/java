package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Student {
	//멤버 변수 
	private int studentNumber;					//학생의 학번
	private String studentName;				//학생의 이름
	private Subject majorSubject;			//학생의 전공
	private ArrayList<Score> scoreList = new ArrayList<>();		//학생이 수강한 과목의 점수리스트
	
	public Student (int studentNumber, String studentName, Subject majorSubject) {	//생성자
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	public void addSubjectScore (Score score) {		//리스트에 학생이 수강한 과목의 점수추가
		scoreList.add(score);
	}

	public int getStudentId() {
		return studentNumber;
	}

	public void setStudentId(int studentId) {
		this.studentNumber = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	public ArrayList<Score> getScores(){
		return scoreList;
	}
	

}
