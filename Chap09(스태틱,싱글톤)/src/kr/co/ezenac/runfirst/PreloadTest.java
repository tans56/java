package kr.co.ezenac.runfirst;

import java.util.Random;

public class PreloadTest {
	
	static int num;			//스태틱 멤버 변수
	
	//static 초기화 블록
	static {
		Random random = new Random();
		
		num = random.nextInt(100);			//main() 실행전에 이미 난숫값이 대입이 됨
	}
	public static void main(String[] args) {
		System.out.println(num);
	}
}
