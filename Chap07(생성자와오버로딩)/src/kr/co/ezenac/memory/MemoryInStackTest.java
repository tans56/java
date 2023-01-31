package kr.co.ezenac.memory;

public class MemoryInStackTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int res = adder(num1, num2);
		System.out.println(res);
	}

	public static int adder(int n1, int n2) {		
		int result = n1 + n2;
		return result;
	}

}
