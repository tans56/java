package kr.co.ezenac.encapsulation;

public class AddressTest {

	public static void main(String[] args) {
		DisplayAddress displayAddress = new DisplayAddress();
		String strBuffer = displayAddress.getAddress();
		
		System.out.println(strBuffer);

	}

}
