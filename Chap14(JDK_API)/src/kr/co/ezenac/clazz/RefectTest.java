package kr.co.ezenac.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RefectTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = clazz.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);}
		
	System.out.println();
	
	Method[] methods =  clazz.getMethods();
	for(Method method : methods) {
		System.out.println(method);
	}
	
	
	}
	
	
}
