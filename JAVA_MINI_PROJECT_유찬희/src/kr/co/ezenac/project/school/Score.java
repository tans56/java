package kr.co.ezenac.project.school;

public class Score {
	//멤버변수
	private int studentNumber;			//학생의 학번
	private Subject Subject;			//과목
	private int point;					//점수
	
	public Score(int studentNumber, Subject Subject, int point) {		//생성자
		this.studentNumber = studentNumber;
		this.Subject = Subject;
		this.point = point;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public Subject getSubject() {
		return Subject;
	}


	public int getPoint() {
		return point;
	}

	
}

