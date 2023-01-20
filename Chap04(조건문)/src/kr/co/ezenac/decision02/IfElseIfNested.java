package kr.co.ezenac.decision02;

import java.util.Scanner;
/*
 * 중첩 if문
 * 		- 무제한적으로 중첩if문은 들어갈수 있음.
 * 		- 보통 2개를 초과하지 않도록 하는게 가독성면에서 좋음
 */
public class IfElseIfNested {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		if(score >= 0 && score <= 100) {
			if (score >= 90) {
				if (score >= 95) {
					System.out.println("당신은 A+ 학점입니다.");
				} else {
					System.out.println("당신은 A0 학점입니다.");
				}
			}else if (score >= 80) {
				if(score >=85) {
				System.out.println("당신은  B+ 학점입니다.");
			} else {
				System.out.println("당신은 B0 학점입니다.");
			}
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		scan.close();
	}

}
