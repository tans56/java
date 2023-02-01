package kr.co.ezenac.collabration;

public class Bus extends Object{ //extends Object 생략되어 있음
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		//super();  //extends Object를 가리킴 (생략되어 있음)
		this.busNumber = busNumber;
	}
	
	//승차하다
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은" 
	                       + passengerCount + "명이고, 수입은"
				           +money+ "원 입니다.");
	}
}
