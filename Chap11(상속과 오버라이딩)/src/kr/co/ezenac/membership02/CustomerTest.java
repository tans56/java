package kr.co.ezenac.membership02;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerL = new Customer();
//		customerL.setCustomerName("이순신");
//		customerL.setCustomerId(202302);
		
		Customer customerL = new Customer("이순신2", 20230207);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		System.out.println();
		
		VIPCustomer customerS = new VIPCustomer("신사임당2", 20230208);
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		
		System.out.println();
		Customer customerJ = new VIPCustomer("진도준", 20230209);
		customerJ.bonusPoint = 10000;
		//customerJ는 Customer 클래스의 멤버변수와 메서드만 사용가능
		System.out.println(customerJ.showInfo());
				

	}

}
