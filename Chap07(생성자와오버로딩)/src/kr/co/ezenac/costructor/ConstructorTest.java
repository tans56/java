package kr.co.ezenac.costructor;

class Book{
	String title;
	int price;
	int num = 0;
	
	//디폴트 생성자
	public Book() {
		this.title = "그래프 머신러닝";
		price = 35000;
	}
	
	
	//생성자 오버로딩
	public Book(String t, int p) {
		title = t;
		this.price = p;
	}
	
	public void Print() {
		System.out.println("제   목 : " + title);
		System.out.println("가   격 : " + price);
		System.out.println("주문수량 : " + num);
		System.out.println("합계금액 : " + price * num);
	}
}

public class ConstructorTest {
	
	public static void main(String[] args) {
		
		//디폴트 생성자 사용
		Book book = new Book();			
		book.num = 1;
		book.Print();
		
		System.out.println();
		
		//오버로딩된 생성자 사용
		Book book2 = new Book("자연어 처리 쿡북 with 파이썬", 30000);
		book2.num = 10;
		book2.Print();
	}
	
}
