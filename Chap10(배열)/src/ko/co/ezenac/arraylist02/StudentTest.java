package ko.co.ezenac.arraylist02;

/*
 *	EzenIT 학원에 학생이 3명 있습니다.
 *	각 학생마다 읽은 책을 기록하고 있습니다.
 * 	
 * 	학생마다 읽은 책을 Student클래스내에 ArrayList를 생성하여 관리하도록 합니다.
 * 	아래처러 출력되도록 클래스를 정의해서 구현하시오.
 * 
 * <출력>
 * 	이순신 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 *  신사임당 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 *  진도준 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6,
 * 
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentL = new Student(2023, "이순신");
		studentL.addBook("운영체제1", " ");
		studentL.addBook("운영체제2", " ");
		studentL.showInfo();
		System.out.println();
		
		Student studentS = new Student(2022, "신사임당");
		studentS.addBook("딥러닝1", " ");
		studentS.addBook("딥러닝2", " ");
		studentS.addBook("딥러닝3", " ");
		studentS.showInfo();
		System.out.println();
		
		Student studentJ = new Student(2021, "진도준");
		studentJ.addBook("머신러닝1", " ");
		studentJ.addBook("머신러닝2", " ");
		studentJ.addBook("머신러닝3", " ");
		studentJ.addBook("머신러닝4", " ");
		studentJ.addBook("머신러닝5", " ");
		studentJ.addBook("머신러닝6", " ");
		studentJ.showInfo();
		
	}

}
