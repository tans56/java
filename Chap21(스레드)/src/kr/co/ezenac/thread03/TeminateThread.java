package kr.co.ezenac.thread03;

import java.io.IOException;

public class TeminateThread extends Thread {

	private boolean flag = false;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public TeminateThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(!flag) {
		try {
			Thread.sleep(100);
		 } catch (InterruptedException e) {e.printStackTrace();}
	 }
		System.out.println(getName() + "end");
 }
	
	
	public static void main(String[] args) throws IOException {
		
		TeminateThread threadA = new TeminateThread("A");
		TeminateThread threadB = new TeminateThread("B");
		TeminateThread threadC = new TeminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			
			if(in == 'A')
				threadA.setFlag(true);
			else if (in == 'B')
				threadB.setFlag(true);
			else if (in == 'C')
				threadC.setFlag(true);
			else if (in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
		}	
		
		System.out.println("Main Thread end!");
	}
}





























