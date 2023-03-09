package baekjoontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int sum = a*b*c;
		String snum = Integer.toString(sum);	
		
		for(int i=0;i<=9;i++) {
			int count = 0;
			for(int j=0;j<snum.length();j++) {
				if(i == snum.charAt(j) - 48) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
