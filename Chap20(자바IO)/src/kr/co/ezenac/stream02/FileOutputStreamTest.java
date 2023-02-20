package kr.co.ezenac.stream02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try(OutputStream fos = new FileOutputStream("output.txt", true)){
			
			//파일에 한 바이트씩 쓰기
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
