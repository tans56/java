package kr.co.ezenac.project.School;

public class Score {

	private int studentId;			//학번
	private Subject subject;		//과목
	private int Score; 				//점수

	public Score(int studentId, Subject subject, int score) {
		this.studentId = studentId;
		this.subject = subject;
		this.Score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public int getScore() {
		return Score;
	}
	
	
}
