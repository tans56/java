package kr.co.ezenac.interface5;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		
		xClass.x();
		
		Y yClass = mClass;
		
		yClass.y();
		
		MyClass nClass = mClass;
		
		nClass.x();
		nClass.y();
		nClass.myMethod();

	}

}
