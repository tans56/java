package kr.co.ezenac.interface2;

public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio 볼륨의 최대치 값은 10이다.");
		this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio 볼륨의 최소치 값은 0이다.");
		}else {
			this.volume = volume;
		}
		return;
		
	}

}
