package kr.co.ezenac.membership;

/*
 * 	* 일반고객(Customer)과 우수고객(VIPCustomer) 
 * 		- 할인율과 적립되는 보너스 포인트의 비율이 다름
 * 		- 상속을 활용해서 구현하기 
 * 	* 일반고객
 * 		- 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율 (1%의 포인트 적립)
 */
public class Customer {
		
	private int customerId;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		System.out.println("Customer() 생성자 호출");
	}

}
