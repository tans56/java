package kr.co.ezenac.interface2;

public interface RemoteControl {

	//상수 (static final)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메서드 (abstract)
	public void turnOn();
	public void turnoff();
	public void setVolume(int volume);
	
}
