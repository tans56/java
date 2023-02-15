package kr.co.ezenac.lambda04;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Ezen!";
		//클래스 생성하고 메서드 호출하기
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		//람다식으로 구현하기
		StringConcat concat2 = (s, v) -> System.out.println(s +", "+v );
		concat2.makeString(s1, s2);
		
		/*
		 * 익명 객체를 생성하는 람다식 
		 * 	- 자바에서는 객체없이 메서드 호출 될수 없음
		 * 	- 람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨		
		 */
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 +", "+ s2 );
				
			}
		};
		
		concat3.makeString(s1, s2);
	}

}
