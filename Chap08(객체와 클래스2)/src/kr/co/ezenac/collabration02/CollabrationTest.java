package kr.co.ezenac.collabration02;

public class CollabrationTest {

	public static void main(String[] args) {
		Student student = new Student("진도준", 20000);
		
		Taxi taxi = new Taxi("이젠 운수");
		
		student.takeTaxi(taxi);
		
		student.showInfo();		
		taxi.showInfo();

	}

}
