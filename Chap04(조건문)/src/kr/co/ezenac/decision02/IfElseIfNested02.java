package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 * 사용자로부터 성별, 나이, 신체등급 순서로 입력받아서
 * 신체등급 1 ~ 3 : 현역
 * 신체등급 4	    : 공익
 * 그 외         : 면제
 *  출력되는 프로그램을 만드시오.
 *  단, 성별을 입력 받을시 정수로 입력을 받아 1이면 남자 2면 여자로 판단한다
 *  또한 여자일 경우 추가적인 정보 입력 대신에 " 여성에게는 국방의 의무가 없습니다." 가 
 *  출력되게 만드시오.
 *  또한 남자이지만 미성년자인 경우 추가적인 정보 입력 대신 "미성년자에게는 아직 신체등급이 
 *  부여되지 않습니다."가 출력되게 만드시오. 
 *  
 *  출력예시
 *  "성별(1은 남자, 2는 여자) : "
 *  나이:
 *  신체등급 : 
 *  현역
 */


public class IfElseIfNested02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별(1은 남자, 2는 여자) :");
		int gender = scan.nextInt();
		
		if(gender == 1 ) {
			//남자이므로 나이 입력받음
			System.out.print("나이 :");				
			int age = scan.nextInt();
			if( age >= 19 ) {
				//19세 이상이므로 신체등급 받음
				System.out.print("신체등급 : ");
				int rank = scan.nextInt();
				
				if(rank >= 1 && rank <= 4) {
					if(rank <= 3) {
						System.out.println("현역");
					}else if(rank == 4) {
						System.out.println("공익");
					}
				}else {
					System.out.println("면제");
				}
			}else {
				System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
			}
			
		}else {
			System.out.println("여성에게는 국방의 의무가 없습니다.");
		}
		
		
		
		
		
		
		
		scan.close();
	}
}
