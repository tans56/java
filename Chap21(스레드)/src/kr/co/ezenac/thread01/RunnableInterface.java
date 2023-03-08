package kr.co.ezenac.thread01;

public class RunnableInterface {

	public static void main(String[] args) {
		
		//Runnable 변수에 람다식을 대입함
		Runnable task = ()-> {
			try {
				Thread.sleep(3000);		// 스레드 실행이 3초동안 일시정지했다가 다시 진행됨.
			} catch (InterruptedException e) {e.printStackTrace();}
			
			int sum =0;
			for(int i=0; i<=10; i++)
				sum +=i;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + sum);
			
		};
	
		Thread thread = new Thread(task);
		thread.start();
	
		System.out.println("main : " + Thread.currentThread().getName());
	
	
	
	}
}
