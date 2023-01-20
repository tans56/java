package kr.co.ezenac.loop;

public class ForTest04 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 1;
		int i = 0;
		
		for( ; i <10; i++) {
			sum += count;
			count++;
		}
		System.out.println(sum);
		
		count = 1;
		sum = 0;
		
		System.out.println("===============================================");
		
		for(i = 0; ; i++) {
			sum += i; 
			if(i >=10) break;
			
			
		}
		System.out.println(sum);
		
		
		sum = 0;
		
		System.out.println("===============================================");
		
		for(i = 0; i <= 10; ) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		//무한반복
//		for(; ; ) {
//			
//		}
	}
	

}
