package kr.co.ezenac.interface4;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayWeAreTheWorld();
		customer.order();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		
	}
	
	
}
