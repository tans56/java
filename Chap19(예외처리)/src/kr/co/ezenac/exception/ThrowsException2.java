package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
		
	}	
	
	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadClass("ezenit1.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {			// ( | ) 기호로 붙여서 쓸수있음 멀티예외처리
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("program end");
		
	}
	
}
