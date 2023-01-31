package kr.co.ezenac.overloading02;

public class StudentTest {

	public static void main(String[] args) {
		//기본 생성자 호출
		Student student = new Student();
		System.out.println(student);
		
		System.out.println();
		
		//매개변수가 있는 생성자
		Student student2 = new Student("이순신",30);
		System.out.println(student2);
		
		System.out.println();
		
		//매개변수가 String만 있는 생성자 호출 
		Student student3 = new Student("신사임당");
		System.out.println(student3);
		
		System.out.println();
		
		//매개변수가 int만 있는 생성자 호출
		Student student4 = new Student(20);
		System.out.println(student4);
	}

}
