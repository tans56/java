package kr.co.ezenac.loop;

// *0*0* 
// *0*0*
// *0*0*
// *0*0*
// *0*0*
public class Test01 {

	public static void main(String[] args) {
				
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}

}
