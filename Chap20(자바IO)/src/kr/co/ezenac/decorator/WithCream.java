package kr.co.ezenac.decorator;

public class WithCream extends Decorator{
	public WithCream(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("크림 추가 ");
	}
}
