package kr.co.ezenac.membership;

/*
 *	1) 일반고객과 VIP고객의 중간 멤버십 요청이 발생함
 *		- 일반고객보다 많이 구매하고, VIP보다는 적게 구매하는 고객에도 혜택을 줌
 *		- Gold 고객 등급 생성
 *			- 제품 살때 10% 할인
 *			- 보너스 포인트 2% 적립
 * 
 */

public class GoldCustomer extends Customer {
		double salesRatio;
		
		public GoldCustomer(String customerName, int customerId) {
			super(customerName, customerId);
			this.customerGrade = "GOLD";
			this.bonusRatio = 0.02;
			this.salesRatio = 0.1;
			System.out.println("GoldCustomer(String, int) 생성자 호출");
		}
		
		@Override
		public int clacPrice(int price) {
			bonusPoint += price * bonusRatio;				
			return price - (int)(price * salesRatio);
		}
		
}
