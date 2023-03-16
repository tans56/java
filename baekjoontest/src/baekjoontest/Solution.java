package baekjoontest;

public class Solution {
	
	public static void main(String[] args) {
		
		//프로그래머스 LV.1 콜라츠 추측
		int n = 6;
		long num = n;
		int answer = 0;
		
		while(num != 1) {
			if(num % 2 == 0) {
				num /=2;												
			}else {				
				num = num*3+1;
							
			}
			answer++;	
			
			if(answer > 500)
				System.out.println(-1); 
		}
		System.out.println(answer); 
	}

}
