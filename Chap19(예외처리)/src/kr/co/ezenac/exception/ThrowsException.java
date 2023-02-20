package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
		
	}	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("ezenit.txt", "java.lang.String1");
		} catch (FileNotFoundException e) {			
//			e.printStackTrace();
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (ClassNotFoundException e) {			
//			e.printStackTrace();
			System.out.println("ClassNotFoundException : " + e.getMessage());
		}  catch (Exception e) {													// Exception은 맨끝에 위치해야 한다
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("program end");
		
	}
	
}
