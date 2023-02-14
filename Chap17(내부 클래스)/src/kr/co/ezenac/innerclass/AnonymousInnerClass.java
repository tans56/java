package kr.co.ezenac.innerclass;

class Outter {

	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {				//return new로 객체 생성 동시에 Runnable 타입 반환
			int localNum = 10; 
			
			@Override
			public void run() {
//				i = 100;		//에러남. 매개변수는 상수로 바뀜
//				num = 200;		//에러남. 지역변수는 역시 상수로 바뀜
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				
			}
			
		};
					
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
			
		}
	};
	
	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
	}
}






















