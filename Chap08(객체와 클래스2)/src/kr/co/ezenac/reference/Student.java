package kr.co.ezenac.reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;			// 참조변수로 선언 (객체로 생성하기전인 상태 new를 사용하여 생성 가능하다)
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();		// 인스턴스 생성
		math = new Subject();
	}
	
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	

	public void showStudentScore() {
		int sum = korea.score + math.score;		 
		System.out.println(studentName +" 학생의 총점수는 " 
	                       + sum + "점 입니다.");
	 }
	
	
	
}
