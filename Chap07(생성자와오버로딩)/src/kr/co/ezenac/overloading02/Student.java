package kr.co.ezenac.overloading02;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		this(25);
		System.out.println("기본 생성자 호출");
	}
	
	public Student(String name) {
		System.out.println("매개변수가 String만 있는 생성자 호출");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		this.age = age;
	}
	
	//매개변수가 있는 생성자
	
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.getName()+", "+ this.getAge();
	}
	
	
	
}
