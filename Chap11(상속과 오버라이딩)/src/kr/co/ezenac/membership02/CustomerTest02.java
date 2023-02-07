package kr.co.ezenac.membership02;

public class CustomerTest02 {

	public static void main(String[] args) {
		
		Customer customerL = new Customer("이순신", 2023);
		customerL.bonusPoint = 1000;
		int priceL = customerL.clacPrice(10000);
		System.out.println(customerL.showInfo()+"지불금액은 "+ priceL+ " 원 입니다.");
		System.out.println();
		
		Customer customerS = new VIPCustomer("신사임당", 202302);
		customerS.bonusPoint = 10000;
		int priceS = customerS.clacPrice(10000);
		System.out.println(customerS.showInfo()+"지불금액은 "+ priceS+ " 원 입니다.");
	}

}
