package kr.co.ezenac.lambda05;

import java.util.function.BiFunction;

/*
 *	 BiFunction Interface
 *		- 매개변수가 두개일때
 */

public class TestBifunction {

	public static void main(String[] args) {
		//함수를 변수처럼 사용하는 람다식 - 인터페이스형 변수에 람다식을 대입하기
		BiFunction<Integer, Integer, Integer> add = 
				(x, y) -> x + y;
				
		int result = add.apply(3, 5);
		System.out.println(result);
	}
}
