package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Subject {
	//멤버변수
	private String subjectName;			// 과목의 이름
	private int subjectNumber;			// 과목의 고유 번호
	private int gradetype;				//학점 평가 정책
	
	private ArrayList<Student> studentList = new ArrayList<>();			//과목에 수강신청한 학생들의 리스트
	
	public Subject(String subjectName, int subjectNumber) {		//생성자
		this.subjectName = subjectName;
		this.subjectNumber = subjectNumber;
	}
	
	public void subjectEnrolment (Student student) {		//수강신청 하는 메서드
		studentList.add(student);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(int subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	public int getGradetype() {
		return gradetype;
	}

	public void setGradetype(int gradetype) {
		this.gradetype = gradetype;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}


		
	}
	

