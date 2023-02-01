package kr.co.ezenac.collabration;

public class CollabrationTest {

	public static void main(String[] args) {
		Student student = new Student("이순신", 10000);
		Student student2 = new Student("신사임당", 50000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subway9 = new Subway(9);
		
		
		
		student.takeBus(bus100);
		student.takeBus(bus100);
		student2.takeSubway(subway9);
		student2.takeSubway(subway9);
		
		student.showInfo();
		student2.showInfo();
		bus100.showInfo();		
		subway9.showInfo();
//		bus200.showInfo();
		
	}

}
