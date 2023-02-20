package kr.co.ezenac.project.grade;

public class BasicScoreEvaluation implements GradeScoreEvaluation{

	@Override
	public String getGrade(int score) {		//일반 학점에 대한 클래스 구현
		String grade;
		
		//if ~else문 으로 A부터 F까지 각 점수에 맞게 학점부여
		if(score >= 90 && score <= 100)
			grade = "A";
		else if(score >= 80 && score <= 89)
			grade = "B";
		else if(score >= 70 && score <= 79)
			grade = "C";
		else if(score >= 55 && score <= 69)
			grade = "D";
		else
			grade = "F";		
		return grade;
	}
	
}
