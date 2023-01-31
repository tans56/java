package kr.co.ezenac.reference;

public class Student {			//객체 안에서 객체 쓰기
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	
	
	
	
	
}
