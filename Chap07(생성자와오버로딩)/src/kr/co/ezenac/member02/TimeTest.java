package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		//time.setHour(-20);
		time.setHour(10);
		//System.out.println(time.getHour());
		
		time.setMinute(30);
		time.setSecond(50);
		System.out.println(time.toString());
		System.out.println(time);				//직접 호출 할수있지만 객체만 써도 자동으로 호출됨
		
	}

}
