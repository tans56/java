package kr.co.ezenac.lambda;

public class TestAdd {

	public static void main(String[] args) {
		
		Add addF = (int x, int y) -> {return x+y;};
		Add addF2 = (x, y) -> x+y;
		
		System.out.println(addF.add(3, 5));
		System.out.println(addF2.add(3, 5));
	}
}
