package kr.co.ezenac.lambda05;

public class TestTriFunction {

	public static void main(String[] args) {
		TriFunction<Integer	, Integer, Integer, Integer> add =
				(x, y, z) -> x + y + z;
				
				int result = add.apply(3, 5, 8);
				System.out.println(result);

	}

}
