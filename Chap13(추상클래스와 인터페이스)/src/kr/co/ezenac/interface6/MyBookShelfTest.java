package kr.co.ezenac.interface6;

public class MyBookShelfTest {

	public static void main(String[] args) {
		Queue bQueue = new MyBookShelf();
		bQueue.enQueue("챗GPT");
		bQueue.enQueue("리더의 생각");
		bQueue.enQueue("4차 산업혁명 시대의 IT 개론과 실습");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());

	}

}
