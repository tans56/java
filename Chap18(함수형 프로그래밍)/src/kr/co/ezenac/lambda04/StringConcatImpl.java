package kr.co.ezenac.lambda04;

//인터페이스를 구현한 클래스 만들기
public class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
		
	}

}
