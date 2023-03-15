package baekjoontest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Ex03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());	
		
		int count = 0;
		while(st.hasMoreTokens()) {
			int t = Integer.parseInt(st.nextToken());
			if(t == v) count++;
		}

		bw.write(count + "\n");
		bw.flush();
//		int[] arr = new int[n];		
//		int count = 0;
//		
//		for(int i =0; i<arr.length; i++) {			
//			
//			arr[i] += snum.charAt(i)-48;			
//			if(arr[i] == v) {
//				count++;
//			}	
//		}
//		System.out.println(count);
	}
}

