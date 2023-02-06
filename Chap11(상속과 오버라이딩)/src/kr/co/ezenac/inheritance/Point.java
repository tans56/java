package kr.co.ezenac.inheritance;


//독립 클래스
public class Point {
	
	
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		System.out.println("Point 클래스에 매개변수가 있는 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
}
