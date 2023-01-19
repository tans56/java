package kr.co.ezenac.variable02;

public class DoubleTest02 {

	public static void main(String[] args) {
		
		double dNum = 0.0;
		
		for(int i = 0; i <1000; i=i+1) {
			dNum = dNum + 0.1;
		}
		System.out.println(dNum);
	}

}
