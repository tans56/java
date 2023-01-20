package kr.co.ezenac.loop;

public class ForTest05 {

	public static void main(String[] args) {
		
		for(int i = 1; i <10; i++) {
			System.out.print((2 * i) + " ");
		}
		
		System.out.println();
		// 한줄만 실행하면 중괄호 생략 가능
		for(int i = 1; i<10; i++) 
			System.out.print(3*i + " ");
		
		System.out.println();
		// 같은줄에 작성 가능. 가독성 떨어짐
		for(int i = 1; i<10; i++) System.out.print(4*i + " ");
	}

}
