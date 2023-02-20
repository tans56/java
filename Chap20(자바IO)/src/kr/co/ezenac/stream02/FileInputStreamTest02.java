package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		
		try(InputStream fis = new FileInputStream("input.txt")){
			
			int i;
			//파일의 끝까지 한 바이트씩 자료 읽기
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("\nprogram end");
	}

}
