package kr.co.ezenac.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("이순신");
		System.out.println(person);
		
		System.out.println();
		
		Class clazz = Class.forName("kr.co.ezenac.clazz.Person");
		Person person2 = (Person) clazz.newInstance();
		System.out.println(person2);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = clazz.getConstructor(parameterTypes);
		
		Object[] reflecargs = {"신사임당"};
		Person personShin =  (Person) cons.newInstance(reflecargs);
		System.out.println(personShin);
		
	}
}














