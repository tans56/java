package kr.co.ezenac.membership;

/*
 * 	* 일반고객(Customer)과 우수고객(VIPCustomer) 
 * 		- 할인율과 적립되는 보너스 포인트의 비율이 다름
 * 		- 상속을 활용해서 구현하기 
 * 	* 일반고객
 * 		- 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율 (1%의 포인트 적립)
 * 
 * 	* protected 접근 지정자(제어자)
 * 		- 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할수 없음
 * 		- 외부 클래스는 접근 할수 없지만, 하위 클래스는 접근할수 있도록 protected 접근 제어자를 사용
 * 	
 */
public class Customer {
		
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		bonusRatio = 0.01;
//		customerGrade = "SILVER";
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(String customerName , int customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		System.out.println("Customer 클래스에 매개변수가 있는 생성자 호출");
	}
	
	
	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerGrade() {
		return customerGrade;
	}



	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



	public int clacPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " +customerGrade+
				"이며, 보너스 포인트는 "+bonusPoint+ "입니다.";
	}

}
