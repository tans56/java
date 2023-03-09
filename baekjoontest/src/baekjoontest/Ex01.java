package baekjoontest;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Ex01 {

public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pi = br.readLine();
		
		
		int[] arr = new int[26];
//		
//		for(int i = 0; i < arr.length; i++) {
//			char ch = pi.charAt(i);
//			arr[ch-97]++;			
//		}

		
		for(int i=0;i<26;i++) {
			for(int j=0;j<pi.length();j++) {
				if(i + 97 == pi.charAt(j))
					arr[i]++;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}