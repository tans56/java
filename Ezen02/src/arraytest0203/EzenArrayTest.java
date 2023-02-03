package arraytest0203;

public class EzenArrayTest {

	public static void main(String[] args) {
		EzenArray arr1 = new EzenArray();
		System.out.println("====출     력====");
		arr1.allPrint();  			//출력 (데이터 입력 전이라 비어있는값으로 나옴)
		System.out.println();
		
		System.out.println("====데이터 추가====");
		arr1.addData(10);			//데이터 추가
		arr1.addData(20);
		arr1.addData(30);
		arr1.addData(40);
		arr1.addData(50);
		arr1.allPrint();			
		System.out.println();
		
		System.out.println("====특정 위치에 요소 추가====");
		arr1.insertData(1, 80); 	//특정 위치에 요소 추가 index1 자리에 80을 추가
		arr1.allPrint();
		System.out.println();
		
		System.out.println("====사이즈 값 확인====");
		int sizeCh = arr1.getSizeCheck();
		System.out.println("현재 배열에 할당된 크기 : " + sizeCh);		//사이즈 체크 총6개
		System.out.println();
		
		System.out.println("====특정요소 삭제====");
		arr1.removeElement(1);		//특정 위치에 있는 요소를 삭제 index1에 있던 80을 삭제
		arr1.allPrint();
		System.out.println();
		
		System.out.println("====모두   삭제====");
		arr1.removeAll();
		arr1.allPrint();			//요소 전부를 삭제 그러므로 출력할 내용이 없음
		System.out.println();
		
		System.out.println("====특정위치요소 읽기====");
		arr1.addData(10);			//위에서 데이터 값을 모두 삭제 했기에 다시 추가
		arr1.addData(20);
		arr1.addData(30);
		arr1.addData(40);
		arr1.addData(50);
		
		arr1.getData(2);			// index2번 자리에 있는 30을 출력
		
	}

}
