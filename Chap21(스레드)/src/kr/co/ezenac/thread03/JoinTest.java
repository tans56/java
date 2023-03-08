package kr.co.ezenac.thread03;

/*
 *  1~50, 51~100 까지의 합을 구하는 두개의 Thread를 만들어 결과 확인
 */


public class JoinTest extends Thread{

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
		public void run() {
		int i;
		for(i = start; i<=end; i++)
			total +=i;
		}
	
	
	
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread() + "start");
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();					// main 스레드는 not running 상태로 됨
			jt2.join();
		} catch (InterruptedException e) {e.printStackTrace();}

			

		
		
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		int sum = jt1.total + jt2.total;
		System.out.println("sum = " + sum);
		
		
		System.out.println(Thread.currentThread() + "end");
	}
}




































