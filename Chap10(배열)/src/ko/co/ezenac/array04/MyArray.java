package ko.co.ezenac.array04;


/*
 *  * Array 특징
 * 	- 동일한 데이터 타입을 순서에 따라 관리하는 자료구조
 *	- 정해진 크기가 있음
 *	- 요소의 추가와 제거시 다른 요소들의 이동이 필요함
 *	- 배열의 i번째 요소를 찾는 인덱스 연산이 빠름 
 */


public class MyArray {
	
	//멤버선언
	int[] intArr;
	int count;
	
	//상수 선언
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	//생성자 선언
	public MyArray() { 		//사이즈 10개 고정
		count = 0;
		ARRAY_SIZE = 10;
		//객체생성
		intArr = new int[ARRAY_SIZE];
	}
	
	// 생성자오버로딩
	public MyArray(int size) {		//객체 생성할때 MyArray만큼 커짐 (사이즈 정의 가능)
		count = 0;			
		ARRAY_SIZE = size;
		//객체생성
		intArr = new int[ARRAY_SIZE];
	}
	
	//출력하는 메소드 정의
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(intArr[i]);
		}
		
	}
	
	
	//데이터를 추가하는 메소드
	public void  addElement(int num) {		//앞에서부터 순차적으로 추가
		if(count >= ARRAY_SIZE) {
			System.out.println("메모리가 부족합니다.");
			return;
		}
		
		intArr[count++] = num;
	}
	
	//원하는 인덱스에 데이터 추가하는 메소드
	public void insertElement(int position, int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("메모리가 꽉 찼습니다.");
			return;
		}
		
		if(position < 0 || position > count) {	//예외처리
			System.out.println("인덱스 에러입니다.");
			return;
		}
		
		for(int i = count-1; i>= position; i--) {		//멀리서부터 하나씩 오른쪽으로이동
			intArr[i+1] =intArr[i];
		}
		
		intArr[position] = num;
		count++;
	}
	//사이즈값 확인
	public int getSize() {
		
		return count;
	}
	
	//전체 데이터 삭제
	public void removeAll() {
		for(int i =0; i<count; i++ ) {
			intArr[i] = 0;
		}
		count = 0;
	}
	
	//원하는 인덱스 요소만 삭제
	public int removeElement(int position) {
		
		int result = ERROR_NUM;
		
		if(isEmpty()) {			//예외처리
			System.out.println("데이터가 하나도 없습니다.");
			return result;
		}
		
		if(position < 0 || position > count) {	//예외처리
			System.out.println("삭제하는 도중에 에러가 발생했습니다.");
			return result; 
		}
		
		result = intArr[position];
		
		for(int i=position; i<count-1; i++) {		//가까이서부터 하나씩 왼쪽으로 이동
			intArr[i] =intArr[i+1];
		}
		count--;
		
		return result;
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}else 
			return false;
	}
	
	//원하는 인덱스 출력(getElement())
	
	public void getElement(int position) {
		
		
		
		if(isEmpty()) {			//예외처리
			System.out.println("데이터가 하나도 없습니다.");
			return ;
		}
		
		if(position < 0 || position > count -1) {	//예외처리
			System.out.println("검색 위치 오류입니다." + "현재 배열 요소의 개수는 " + count+ "개 입니다.");
			return ; 
		}
		
		
		
		for(int i = position; i<count; i++) {
			System.out.println(intArr[position]);
			return ;
		}
		
		
		return ;
		
		
		
	}
	
	
	
	
}


































