package kr.co.ezenac.loop;

import java.util.Iterator;

//1~100까지 합을 구하시오

public class ForTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
			//System.out.println("sum : " + sum);
		}
			System.out.println("1~100까지 합 : " + sum);
	}

}


