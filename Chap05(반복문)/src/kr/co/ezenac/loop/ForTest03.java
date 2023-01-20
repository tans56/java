package kr.co.ezenac.loop;

import java.util.Iterator;


//2000이상 일때 i값 그댸의 누적합을 구하시오
public class ForTest03 {

	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum >= 2000) {
				temp = i;
				break;		//감싸고 있는 제어문의 블록을 빠져 나오는 기능
			}
			
		}
		System.out.println("2000이상 일때 i값 : " + temp);	
		System.out.println("2000이상 일때 누적값 : " + sum);
	}

}


