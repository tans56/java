package kr.co.ezenac.templatepattern;

public class DeepLCar extends Car {

	@Override
	protected void stop() {
		System.out.println("스스로 멈춥니다.");		
	}

	@Override
	protected void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}
	
}
