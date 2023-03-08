package kr.co.ezenac.thread01;

/*
 *  여러개의 스레드가 동시 실행
 *  - 20미만의 짝수 출력
 *  - 10미만의 수 출력
 *  
 *  - 0 (9)
 */


public class RunnableInterface02 {

	public static void main(String[] args) {
		
		Runnable task1 = ()->{
			
			int i;
			for(i=0; i<20; i++) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
				
		};
		
		Runnable task2 =()->{
			
			int j;
			for(j=9; j>=0; j--) {
				System.out.print("(" + j + ")");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {e.printStackTrace();}
			}	
		};
		
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();
		thread2.start();
		
		long id = Thread.currentThread().getId();				//스레드 고유의 식별자 번호
		String name = Thread.currentThread().getName();
		Thread.State state = Thread.currentThread().getState();						//스레드 상태값 얻기
		
		System.out.println("현재 스레드 Id = " + id);
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 상태 = " + state);
		
	}
}






























