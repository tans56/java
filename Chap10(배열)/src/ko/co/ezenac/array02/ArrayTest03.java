package ko.co.ezenac.array02;

public class ArrayTest03 {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		Double[] dArr2 = new Double[5];		//기본형을 클래스로 만듬 (객체 배열)
		int count = 0;
		
		dArr[0] = 1.1;	count++;
		dArr[1] = 2.1;	count++;
		dArr[2] = 3.1;	count++;
		
		double mtotal = 1;
		for(int i =0; i< count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
	}

}
