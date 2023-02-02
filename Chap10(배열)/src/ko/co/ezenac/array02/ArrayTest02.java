package ko.co.ezenac.array02;

public class ArrayTest02 {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1; 
		for(int i=0; i< dArr.length; i++) {	//dArr.length를 썼기에 [4] [5] 0 이므로 값은 0이 나옴
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
	}

}
