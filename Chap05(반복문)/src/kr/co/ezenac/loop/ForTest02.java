package kr.co.ezenac.loop;

public class ForTest02 {
	
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i =0; i < 10; i++, count++) {
			sum += count;
		}
		System.out.println(sum);
	}
}
