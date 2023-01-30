package kr.co.ezenac.loop04;

import java.util.Scanner;

/*
 * 메세지를 입력하세요.
 * 프로그램을 종료하려면, q를 입력하세요.
 * >눈이 옵니다
 * 입력받은 메시지 : 눈이 옵니다
 * >겨울이네요
 * 입력받은 메시지 : 겨울이네요
 * >q
 * 입력받은 메시지 : q
 * 프로그램을 종료합니다
 */




public class DowhileTest02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료할려면, q를 입력하세요.");		
		
		String str =null;
		
		do {
			System.out.print(">");
			str = scanner.nextLine();
			System.out.println("입력받은 메세지 : " + str);
		}while(! str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}

}
