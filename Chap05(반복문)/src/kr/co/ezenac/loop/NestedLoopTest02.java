package kr.co.ezenac.loop;

import java.util.Scanner;

/*
 * 구구단을 출력합니다.
 * 몇 단부터 출력할까요? 3(입력)
 * 끝 단은 얼마인가요? 5(입력)
 * 
 *  ========3단==========
 *  3*1=3
	3*2=6
	...
	3*8=24
	3*9=27
	========4단==========
	4*1=4
	4*2=8
	...
	4*9=36
	========5단==========
	5*1=5
	5*2=10
	...
	5*8=40
	5*9=45
 */

public class NestedLoopTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다. ");		
		System.out.print("몇 단부터 출력할까요? ");
		int sdan = scan.nextInt();
		
		System.out.print("끝 단은 얼마인가요?");
		int edan = scan.nextInt();
		
		
		for(; sdan<=edan; sdan++) {
			System.out.println("=======" + sdan + "단========");
			for(int j=1; j<10; j++) {
				System.out.println(sdan + "*"+ j+"="+ (sdan*j) );
			}
		}
		

		scan.close();

	}
}
