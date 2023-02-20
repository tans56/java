package kr.co.ezenac.project.grade;

public class MajorScoreEvaluation implements GradeScoreEvaluation{

	@Override
	public String getGrade(int score) {		//전공과목에 대한 학점클래스 구현
		String grade;
		
		//if ~ else if문으로 각 점수에 맞게 학점 부여
		if(score >= 95 && score <= 100)
			grade = "S";
		else if(score >= 90 && score <= 94)
			grade = "A";
		else if(score >= 80 && score <= 89)
			grade = "B";
		else if(score >= 70 && score <= 79)
			grade = "C";
		else if(score >= 60 && score <= 69)
			grade = "D";
		else
			grade = "F";		
		return grade;
	}

}
