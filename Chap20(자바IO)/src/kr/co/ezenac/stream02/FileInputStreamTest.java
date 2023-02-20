package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		InputStream fis = null;
		
		try {
			 fis = new FileInputStream("input.txt");
			 //파일의 한바이트씩 자료 읽기
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
//					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		System.out.println("program end");
	}
}





























