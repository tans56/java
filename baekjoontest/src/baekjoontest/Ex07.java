package baekjoontest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a,b,c;
		a= Integer.parseInt(st.nextToken());
		b= Integer.parseInt(st.nextToken());
		c= Integer.parseInt(st.nextToken());
		
		if(a != b && b != c && a != c ) {
			int max = Math.max(a, Math.max(b, c));
			bw.write(String.valueOf(max * 100));
			bw.flush();
		}else if (a == b && a == c) {
			bw.write(String.valueOf(10000 + b * 1000));
			bw.flush();
		}else if (a == b || a== c) {
			bw.write(String.valueOf(1000 + a * 100));
			bw.flush();
		}else {
			bw.write(String.valueOf(1000 + b * 100));
			bw.flush();
			
		}						

	}

}
