package kr.co.ezenac.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(Reader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			int i;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
