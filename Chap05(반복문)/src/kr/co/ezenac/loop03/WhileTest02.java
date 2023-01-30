package kr.co.ezenac.loop03;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1 ~100사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오
		int num = 0;
		int count = 0;
		
		while((num++) <100) {
			
			if((num %5) != 0)
				continue;
			if((num %7) != 0)
				continue;
			
			count++;
			System.out.println(num);
		}
			System.out.println("count : " + count + "개");
	}

}
