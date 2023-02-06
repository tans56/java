package ko.co.ezenac.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentL = new Student(2023, "이순신");
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 70);
		
		Student studentS = new Student(2023, "신사임당");
		studentS.addSubject("국어", 100);
		studentS.addSubject("수학", 80);
		studentS.addSubject("영어", 75);
		
		studentL.showInfo();
		System.out.println();
		studentS.showInfo();

	}

}
