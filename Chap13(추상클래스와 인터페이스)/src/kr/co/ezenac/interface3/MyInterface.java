package kr.co.ezenac.interface3;

public interface MyInterface {
	int MAX_NUM = 100;
	void method();
	
	default void dMethod() {
		System.out.println("정수 계산기 기능 구현합니다.");
	}
	
	static void sMethod() {
		
	}
	
	private void pMethod() {
		
	}
	
	private static void psMethod() {
		
	}
	
}
