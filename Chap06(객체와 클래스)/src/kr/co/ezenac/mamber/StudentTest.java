package kr.co.ezenac.mamber;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.showStudentInfo();
		
		System.out.println();
		Student student2 = new Student();
		student2.studentName = "이순신";
		student2.address = "서울 강남구";
		student2.showStudentInfo();
		
		System.out.println();
		Student student3 = new Student();
		student3.studentName = "신사임당";
		student3.address = "서울 서초구";
		student3.showStudentInfo();
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
