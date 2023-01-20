package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 * validation : 정확한 값 범위를 사용하도록 하는 것
 * 				값의 범위가 연속적이지 않고 띄엄띄엄 있을떄 사용
 */
public class IfElseIfTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 90 && score <= 100) {
			System.out.println("학점은 A입니다.");
		}else if (score >= 80 && score < 90) {
			System.out.println("학점은 B입니다.");
		}else if (score >= 70 && score < 80) {
			System.out.println("학점은 C입니다.");
		}else if (score >= 60 && score < 70) {
			System.out.println("학점은 D입니다.");
		}else if (score >= 0 && score < 60) {
			System.out.println("학점은 F입니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		System.out.println("======================================================");
		
		
		if(score >= 0 && score <= 100) {
			if(score >= 90 ) 
				System.out.println("학점은 A입니다.");
			else if (score >= 80)
				System.out.println("학점은 B입니다.");
			else if (score >= 70)
				System.out.println("학점은 C입니다.");
			else if (score >= 60)
				System.out.println("학점은 D입니다.");
			else
				System.out.println("학점은 F입니다.");
			
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
