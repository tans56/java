package kr.co.ezenac.String;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("ezen");
		String str2 = new String("ezen");
		
		System.out.println(str1== str2);		
		System.out.println(str1.equals(str2));
		
		String str3 = "ezen";
		String str4 = "ezen!";
		
		System.out.println(str1 == str3);			// 주소값 비교
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	}
}
