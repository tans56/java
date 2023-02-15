package kr.co.ezenac.lambda06;

public class TestPrintString {

	public static void main(String[] args) {
		
		//람다식을 변수에 대입
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda ezen!");
		
		//매개변수로 전달하는 람다식
		showMyString(lambdaStr);
		
		//반환 값으로 쓰이는 람다식
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}

	private static PrintString returnString() {
		return s -> System.out.println(s + "lambda ezenitacademy!!!");
		
	}

	private static void showMyString(PrintString p) {
		
		p.showString("hello lambda ezenit!");
	}
	
}


































