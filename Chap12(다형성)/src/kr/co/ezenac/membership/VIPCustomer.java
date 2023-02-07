package kr.co.ezenac.membership;

/*
 *  우수고객
 *  	- 메출에 더 많은  기여를 하는 고객
 *  	- 보너스 포인트 제품 가격의 5%를 적립해 줌		(조정)
 *  	- 제품을 살때 10% 할인해 줌				(추가)
 *  	- 담당 전문 상담원이 배정됨					(추가)
 */
public class VIPCustomer extends Customer{
	double salesRatio;
	private int agentId;
	
	//super 이용하여 상위 클래스의 생성자 명시적으로 호출
	public VIPCustomer(String customerName, int customerId) {
		super(customerName, customerId);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(String, int ) 생성자 호출");
	}
	
	public VIPCustomer(String customerName, int customerId, int agentId) {
		super(customerName, customerId);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
		
		System.out.println("VIPCustomer(String, int, int) 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;				
		return price - (int)(price * salesRatio);
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + " 담당 상담원 번호는 " + agentId+ "입니다.";
	}
	
	
}




































