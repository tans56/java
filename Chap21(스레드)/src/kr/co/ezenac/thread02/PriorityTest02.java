package kr.co.ezenac.thread02;

class PriorityThread2 extends Thread{
	
	@Override
	public void run() {
		int sum =0;
		
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for(int i=0; i<1000000; i++)
			sum += i;
		System.out.println(thread.getPriority() + " end");
	}
}


public class PriorityTest02 {

	public static void main(String[] args) {
		
		
//			PriorityThread2 pt1 = new PriorityThread2();
//			PriorityThread2 pt2 = new PriorityThread2();
//			PriorityThread2 pt3 = new PriorityThread2();
//			PriorityThread2 pt4 = new PriorityThread2();
//			PriorityThread2 pt5 = new PriorityThread2();
//			PriorityThread2 pt6 = new PriorityThread2();
//			PriorityThread2 pt7 = new PriorityThread2();
//			PriorityThread2 pt8 = new PriorityThread2();
//			PriorityThread2 pt9 = new PriorityThread2();
//			PriorityThread2 pt10 = new PriorityThread2();
//			
//			pt1.setPriority(1);
//			pt2.setPriority(2);
//			pt3.setPriority(3);
//			pt4.setPriority(4);
//			pt5.setPriority(5);
//			pt6.setPriority(6);
//			pt7.setPriority(7);
//			pt8.setPriority(8);
//			pt9.setPriority(9);
//			pt10.setPriority(10);
//			
//			pt1.start();
//			pt2.start();
//			pt3.start();
//			pt4.start();
//			pt5.start();
//			pt6.start();
//			pt7.start();
//			pt8.start();
//			pt9.start();
//			pt10.start();
		
		int i;
		for(i = Thread.MIN_PRIORITY; i< Thread.MAX_PRIORITY; i++) {
			PriorityTest02 pt = new PriorityTest02();
			
		}
		
		
	}

}



























