package baekjoontest;

public class Ex05 {
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = {};
	        
	        for(int i =0; i<n; i++) {
	        	int num = x*n;
	        	for(int j=0; j<answer.length; j++) {
	        		answer[i] += num;
	        	}
	        }
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int num = 0;
		long[] answer = {n};
				
		 
        for(int i=0; i<answer.length; i++) {
        	answer[i] += x+num; 
        	num+= x;
        	  
        }       
		System.out.println(answer.toString());
	}

}
