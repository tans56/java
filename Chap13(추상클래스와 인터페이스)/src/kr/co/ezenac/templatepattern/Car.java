package kr.co.ezenac.templatepattern;

public abstract class Car {
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");		
	}

	protected abstract void stop();

	protected abstract void drive();

	public void startCar() {
		System.out.println("시동을 켭니다.");
		
	}
}

















