package kr.co.ezenac.Object;

public class EqualTest {

	public static void main(String[] args) {
		Student studentL = new Student(2023, "이순신");
		Student studentL2 = studentL;
		
		Student shun = new Student(2023, "이순신");
		
		System.out.println(studentL == studentL2);
		
		System.out.println(studentL == shun);
		System.out.println("equals() : " + studentL.equals(shun));
		
		System.out.println(studentL.hashCode());
		System.out.println(shun.hashCode());

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		String str1 = new String("신사임당");
		String str2 = new String("신사임당");
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		System.out.println(System.identityHashCode(studentL));
		System.out.println(System.identityHashCode(shun));
		
		
		
		
		
		
		
		
		
	}

}
