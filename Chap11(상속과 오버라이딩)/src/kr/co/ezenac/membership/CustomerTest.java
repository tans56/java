package kr.co.ezenac.membership;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerL = new Customer();
//		customerL.setCustomerName("이순신");
//		customerL.setCustomerId(202302);
		
		Customer customerL = new Customer("이순신2", 20230207);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		System.out.println();
		
		VIPCustomer CustomerS = new VIPCustomer();
		CustomerS.setCustomerName("신사임당");
		CustomerS.setCustomerId(202303);
		CustomerS.bonusPoint = 10000;
		System.out.println(CustomerS.showInfo());
		


	}

}
