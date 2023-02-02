package ko.co.ezenac.array;

public class IntArrayTest {

	public static void main(String[] args) {
		//길이가 3인 int형 1차원 배열생성
		int[] arr1 = new int[3];
		
		//첫번째 요소 값 저장
		arr1[0] = 100;
		arr1[1] = 90;
		arr1[2] = 80;
		int sum = arr1[0] + arr1[1] + arr1[2];
		
		System.out.println("총합 : " + sum);
		
		int[] arr2 = new int[10];
		int total =0;
		for(int i=0,num=1; i<arr2.length; i++, num++) {
			arr2[i] = num;
			
		}
		for(int i = 0; i<arr2.length; i++) {
			 
			System.out.print(arr2[i]+ " ");
			total += arr2[i];
		}
		System.out.println();
		System.out.println(total);
		
	}

}
