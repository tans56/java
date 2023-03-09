package baekjoontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		String snum = br.readLine().replaceAll(" ","");	
		int v = Integer.parseInt(br.readLine());	
		int[] arr = new int[n];		
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {			
			
			arr[i] += snum.charAt(i)-48;			
			if(arr[i] == v) {
				count++;
			}	
		}
		System.out.println(count);


	}
}

