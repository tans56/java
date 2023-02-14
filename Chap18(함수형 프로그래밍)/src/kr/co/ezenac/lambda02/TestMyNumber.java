package kr.co.ezenac.lambda02;

public class TestMyNumber {

	public static void main(String[] args) {
		
		//람다식을 인터페이스 자료형 변수에 할당
		MyNumber max = (x, y ) -> (x > y) ? x : y;
		
		System.out.println(max.getMax(20, 30));
	}	
}