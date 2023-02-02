package ko.co.ezenac.array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] charArr = new char[26];
		char ch ='A';
		
		for(int i =0; i<charArr.length; i++) {
			charArr[i] = ch++;
			System.out.print(charArr[i]+"," + " ");
			System.out.println((int)charArr[i]);
		}
		System.out.println();
		
		//향상된 for문 사용
		for(char alpha : charArr) {
			System.out.println(alpha +", "+ (int)alpha);
		}
		
		
	}

}


