package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemInOut3 {

	public static void main(String[] args) {
	
		System.out.println("입력 후 '끝'이라고 쓰세요.");
		int i;
		
		try {			

			Reader isr = new InputStreamReader(System.in); 
			
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
