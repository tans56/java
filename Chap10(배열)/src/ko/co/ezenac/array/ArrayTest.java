package ko.co.ezenac.array;

class Box{}

public class ArrayTest {

	public static void main(String[] args) {
		//길이가 5인 int형 배열 생성
		int[] arr1 = new int[5];
		
		//배열 생성 및 초기화 - length 생략해야 함
		//뒤에 초기화하는 데이터 개수를 보고 생략된 숫자 유추함
		int[] arr2 = new int[] {1,2,3,4,5};
		
		//배열 생성 및 초기화 - new int[] 생략 가능
		int[] arr3 = {1,2,3,4,5};
		
		//배열 선언후 배열을 생성	- new int[] 생략불가
		int[] arr4;
		arr4 = new int[] {1,2,3,4,5};
		
		//길이가 7인 double형 1차원 배열을 생성하시오 (arr5)
		
		double[] arr5 = new double[7];
		
		//길이가 9인 float형 1차원 배열을 생성하시오
		float[] arr6;
		arr6 = new float[9];
		
		// 객체 1차원 배열
		Box[] arr7 = new Box[5];
		
		// 배열의 길이
		System.out.println("배열 arr1 길이 : " +arr1.length);
		System.out.println("배열 arr5 길이 : " +arr5.length);
		System.out.println("배열 arr6 길이 : " +arr6.length);
		System.out.println("배열 arr7 길이 : " +arr7.length);
		
		
		
		
		
		

	}

}
