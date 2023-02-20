package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class School {
	
	private static School instance = new School(); 	
	private School() {}		//스쿨 클래스의 기본 생성자
	
	public static School getInstance() {	//getInstance메소드 호출할때 null체크 해서 생성이 안되어 있으면 다시 생성
		if(instance == null)
			instance = new School();		
		return instance;
	}
	
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	public ArrayList<Student> getstudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	
}
