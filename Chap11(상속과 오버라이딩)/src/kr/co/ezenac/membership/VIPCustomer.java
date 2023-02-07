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
	
	public VIPCustomer() {
		super("SILVER" , 1000);  							//(부모클래스 기본생성자 호출)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}
}




































