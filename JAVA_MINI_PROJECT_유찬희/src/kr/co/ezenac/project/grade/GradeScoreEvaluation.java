package kr.co.ezenac.project.grade;

public interface GradeScoreEvaluation {		//점수 정책이 여러개이므로 인터페이스로 선언 후 각 정책클래스에서 구현
	
	String getGrade(int score);
}
