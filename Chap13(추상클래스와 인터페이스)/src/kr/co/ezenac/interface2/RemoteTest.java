package kr.co.ezenac.interface2;

public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl rControl = new Audio();
		rControl.turnOn();
		rControl.setVolume(10);			//Audio 볼륨의 최대치 값은 10이다.
										//현재 Audio : 10
		rControl.setVolume(5); 		//Audio 볼륨의 최소치 값은 0이다.
										////현재 Audio : 0
		rControl.turnoff();
		
		System.out.println();
		
		rControl = new Television();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-50);
		rControl.turnoff();
	}

}
