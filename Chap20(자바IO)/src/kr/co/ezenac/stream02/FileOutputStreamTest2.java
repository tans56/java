package kr.co.ezenac.stream02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos){
			
			//byte[] 배열에 A-Z까지 넣고 배열을 한꺼번에 파일에 쓰기
			byte[] bs = new  byte[26];
			byte data = 65;		//'A'의 아스키 코드 값
			for(int i=0; i<bs.length; i++) 
				bs[i] = data++;		// A-Z까지 배열에 넣기
			
			fos.write(bs); 		//배열을 한꺼번에 출력하기
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
