package kr.co.ezenac.stream04;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("C:\\workspace-java\\Chap20(자바IO)\\postgresql.jar");
		
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
		
		
		
		
		
		
		
		
		
	}
}



























