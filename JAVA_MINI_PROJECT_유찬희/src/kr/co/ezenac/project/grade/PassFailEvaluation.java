package kr.co.ezenac.project.grade;

public class PassFailEvaluation implements GradeScoreEvaluation{

	@Override
	public String getGrade(int score) {		//pass or fail의 학점 정책 구현
		
		//if문을 사용해 점수에 맞게 70점이상은 pass 이하는 fail로 구현
		if(score >= 70) return "P";
		else return "F";
	}

}
