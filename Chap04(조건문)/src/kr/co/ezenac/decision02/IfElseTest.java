package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 * 1) if문 
 * 		-각각 다른 조건 문으로 해석되어 각각 수행하게 됨
 * 2) if~ else if
 *		- 하나의 조건이 만족되면 나머지 else if 부분은 수행되지 않음
*/
public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요: ");
		int age = scan.nextInt();
		int charge;
		
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		
		
		scan.close();

	}

}
