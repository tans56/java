package kr.co.ezenac.loop03;

public class WhileTest {

	public static void main(String[] args) {
		//1~100까지 합을 출력하시오.
		
		int sum = 0;
		int num = 0;			//초기화 부분
		while(num <= 100) {		// while문은 조건식만 들어감
			sum += num;
			num++;			
		}	
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println();
		
		/*
		 * while문은 무한루프용으로 많이 사용함
		 * 	-if문,break문과 함께 무한루프를 벗어날 코드를 작성해 줘야함
		 */
		
		int i = 1;
		while(true) {
			System.out.println(i);
			if(i >= 100) break;
			i++;
		}
		
		
		
		
		
		
	}

}
