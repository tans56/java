package kr.co.ezenac.project.grade;


/*
 * 인터페이스 정의
 * 	- 점수에 따른 학점의 정책은 여러가지가 있을 수 있음
 *  - 인터페이스를 먼저 선언하고, 각 정책 클래스가 이를 구현하도록 함
 */
public interface GradeEvaluation {

	String getGrade(int score);
}
