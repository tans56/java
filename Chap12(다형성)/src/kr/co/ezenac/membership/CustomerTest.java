package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer("이순신", 202302);
		Customer customerS = new Customer("신사임당", 202303);
		Customer customerJ = new GoldCustomer("진도준", 202304);
		Customer customerM = new GoldCustomer("모현민", 202305);
		Customer customerR = new VIPCustomer("유지나", 20230306, 77777);
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerJ);
		customerList.add(customerM);
		customerList.add(customerR);
		
		System.out.println("=====고객 정보 출력=====");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println();
		System.out.println("=====할인율 계산 출력=====");
		int price = 10000;
		for(Customer customer : customerList) {
		int cost = customer.clacPrice(price);
		System.out.println(customer.getCustomerName() + " 님이 " + 
							cost + "원 지불하셨습니다.");
		}
		
		System.out.println();
		System.out.println("=====보너스 포인트 계산 출력=====");
		for(Customer customer : customerList) {
			customer.clacPrice(price);
			System.out.println(customer.getCustomerName()+" 님의 "+ 
								"현재 보너스 포인트는 " +customer.bonusPoint + "점입니다.");
		}
		
	} 

}























