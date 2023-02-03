package ko.co.ezenac.array04;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArray array = new MyArray();
		 
		array.printAll();
		
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1,50);
		array.printAll();
		
		int result = array.getSize();
		System.out.println("현재 배열에 할당된 크기 : " + result);
		
		System.out.println("==============================");
		
		array.removeAll();
		array.printAll();
		
		System.out.println("==============================");
//		array.addElement(10);
//		array.addElement(20);
//		array.addElement(30);
		array.removeElement(4);
		array.printAll();
		
		
		System.out.println("==============================");
		array.addElement(50);
		array.addElement(60);
		array.addElement(70);
		array.getElement(2);
		
		
	}

}
