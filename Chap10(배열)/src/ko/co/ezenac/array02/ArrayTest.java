package ko.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] score=null;
		//score = {100,200};	//배열이 생성 않되어 있는데 값을 대입하고 있음.
		
		score = new int[10];
		//배열명이 곧 주소임.
		System.out.println("score의 주소값 : " + score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score [" +i+"] = " + score[i]);
		}
		
		System.out.println();
		
		// 범위가 1 ~10 까지의 난수를 대입
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*10) +1;
			
		}
		for(int i= 0; i<score.length; i++) {
			if(i !=9) {
				System.out.print(score[i] + ", ");
			}else {
				System.out.print(score[i]);
			}
		}
		
		System.out.println();
		System.out.println(Arrays.toString(score));
		
	}

}
