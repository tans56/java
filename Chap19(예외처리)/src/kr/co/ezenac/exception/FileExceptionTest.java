package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("ezen1.txt");
		} catch (FileNotFoundException e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		 } catch (Exception e) {
			 System.out.println(e.getMessage());
		 }finally {
			try {
				if(fis != null) {
					fis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("정상 수행됩니다.");
	}
}
