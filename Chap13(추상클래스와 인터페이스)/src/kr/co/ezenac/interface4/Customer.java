package kr.co.ezenac.interface4;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell()");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy()");
		
	}

	@Override
	public void order() {
		System.out.println("Customer order()");
	}

	public void sayWeAreTheWorld() {
		System.out.println("We Are The World");
	}

	
}
