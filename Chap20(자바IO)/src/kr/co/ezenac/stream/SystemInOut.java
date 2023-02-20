package kr.co.ezenac.stream;

import java.io.IOException;

public class SystemInOut {

	public static void main(String[] args) {
	
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		try {
			int i = System.in.read();
			int J = System.in.read();
			int K = System.in.read();
			System.out.println(i);
			System.out.println(J);
			System.out.println(K);
//			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
