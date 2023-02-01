package kr.co.ezenac.collabration02;

public class Taxi {
	String TaxiName;
	int passengerCount;
	int money;
	
	public Taxi(String taxiName) {
		this.TaxiName = taxiName;
	}
	
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(TaxiName+ "택시의 승객은 " 
                + passengerCount + "명이고, 수입은 "
		           +money+ "원 입니다.");
	}
}
