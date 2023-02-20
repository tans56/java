package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest03 {

	public static void main(String[] args) {
		
		try(InputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			
			//파일에서 바이트 배열로 자료 읽기 
			while((i = fis.read(bs)) != -1) {
//				for(byte b : bs)
//					System.out.print((char)b);
				for(int k=0; k<i; k++) 
					System.out.print((char)bs[k]);
				System.out.println(" : " + i + " 바이트 읽음");
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
