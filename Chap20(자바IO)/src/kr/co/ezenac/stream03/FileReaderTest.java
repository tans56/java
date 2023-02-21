package kr.co.ezenac.stream03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(Reader fr = new FileReader("reader.txt");) {
			
			int i;
			while((i = fr.read()) != -1) {		//파일에서 문자 읽기 
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
