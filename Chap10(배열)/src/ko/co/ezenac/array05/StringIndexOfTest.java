
package ko.co.ezenac.array05;

/*
 * public int indexOf(int ch) : 문자열에서 문자 찾기
 * 								문자열의 위치를 리턴해줌
 */


public class StringIndexOfTest {

	public static void main(String[] args) {
		String str = "AppleBananaOrange";
		int num1= str.indexOf("a");					//"a" 위치 반환
		int num2= str.indexOf("a", num1 + 1);		//첫 "a" 그다음 "a" 위치 반환
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
