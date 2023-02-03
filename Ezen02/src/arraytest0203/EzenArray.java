package arraytest0203;

public class EzenArray {
	//멤버 선언
	int[] arr;
	int checkcount;
	
	//상수선언
	
	public int Array_Size;
	public static final int ERROR_NUMBER = -999999;
	
	//생성자 선언
	public EzenArray() { 		//사이즈 10개 고정
		checkcount = 0;
		Array_Size = 10;
		//객체생성
		arr = new int[Array_Size];
	}
	//생성자 오버로딩
	public EzenArray(int sizecheck) {
		checkcount = 0;
		Array_Size = sizecheck;
		//객체 생성
		arr = new int[Array_Size];
	}		
	
	//출력하는 메서드
	public void allPrint(){
		if(checkcount == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		for(int i=0; i<checkcount; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//데이터를 추가하는 메서드
	public void addData(int num) {		//앞에서부터 순차적으로 추가
		if(checkcount >= Array_Size) {	
			System.out.println("메모리가 부족합니다.");
			return;
		}
		arr[checkcount++] = num;
	}
	
	//원하는 인덱스에 데이터 추가하는 메서드
	public void insertData(int position, int num) {
		if(checkcount >= Array_Size) {		//예외처리
			System.out.println("메모리가 꽉 찼습니다.");
			return;
		}
		
		if(position < 0 || position > checkcount) {		//예외처리
			System.out.println("인덱스 에러입니다.");
			return;
		}
		
		for(int i = checkcount-1; i>= position; i--) {		//멀리서부터 하나씩 오른쪽으로이동
			arr[i+1] = arr[i];
		}
		
		arr[position] = num;
		checkcount++;
	}
	//사이즈값 확인
	public int getSizeCheck() {
			
			return checkcount;
	}
	// 비어있는값 확인용 메서드
	public boolean vacant() {
		if(checkcount == 0) {
			return true;
		}else 
			return false;
	}
	
	//원하는 인덱스 요소만 삭제
	public int removeElement(int position) {
			
		int result = ERROR_NUMBER;
			
			if(vacant()) {			//예외처리
				System.out.println("데이터가 하나도 없습니다.");
				return result;
			}			
			if(position < 0 || position > checkcount) {	//예외처리
				System.out.println("삭제하는 도중에 에러가 발생했습니다.");
				return result; 
			}			
			result = arr[position];
			
			for(int i=position; i<checkcount-1; i++) {		//가까이서부터 하나씩 왼쪽으로 이동
				arr[i] =arr[i+1];
			}
			checkcount--;
			
			return result;
	}
	
	//전체 데이터 삭제
	public void removeAll() {
		for(int i =0; i<checkcount; i++ ) {
			arr[i] = 0;
		}
		checkcount = 0;
	}
	
	//원하는 인덱스 출력(getElement())
	
	public void getData(int position) {

		if(vacant()) {			//예외처리
			System.out.println("데이터가 하나도 없습니다.");
			return ;
		}
		
		if(position < 0 || position > checkcount -1) {	//예외처리
			System.out.println("검색 위치 오류입니다." + "현재 배열 요소의 개수는 " + checkcount+ "개 입니다.");
			return ; 
		}
		
		
		
		for(int i = position; i<checkcount; i++) {
			System.out.println(arr[position]);
			return ;
		}
		
		
		return ;
		
		
		
	}

	
}




















