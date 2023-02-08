package kr.co.ezenac.interface2;

import javax.print.DocFlavor.READER;

public class Audio implements RemoteControl{
	
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨이 0~10사이에서만 움직일 것으로 프로그래밍하기		
		
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio 볼륨의 최대치 값은 10이다.");
		this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio 볼륨의 최소치 값은 0이다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio : " + this.volume);
	}
	
}
