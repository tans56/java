package kr.co.ezenac.mamber02;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(202301, "진도준", 3);
		String result = student.showStudentInfo();
		System.out.println(result);
		
		System.out.println();
		
		Student student2 = new Student(202302, "진양기", 2);
		result = student2.showStudentInfo();
		System.out.println(result);
	}

}
