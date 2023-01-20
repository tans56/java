package kr.co.ezenac.loop;

public class ForTest06 {

	public static void main(String[] args) {
		
		//2의 배수를 출력하세요
		//0 2 4 6 8
		int i = 0;
		for( ; i<10; i++) {
			if(i % 2 ==0)
				System.out.print(i + " ");
		}
		System.out.println();
		
		i = 0;
		
		for( ; i<10; ) {
			if(i % 2 ==0)
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		for(int j =0; j<10; j+=2) {
			System.out.print(j + " ");
		}
		
		}
		
	}


