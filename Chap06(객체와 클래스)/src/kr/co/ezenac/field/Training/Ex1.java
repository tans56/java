package kr.co.ezenac.field.Training;

class Car{
	String modelName;
	int price;
	int modelYear;
	
	public Car() {
		modelName = "람보르기니";
		price = 150000000;
		modelYear = 2022;
	}
	
	public Car(String mn, int p , int my) {
		modelName = mn;
		price = p;
		modelYear = my;
	}
	
	
	

		public void Print() {
		System.out.println("차량 이름 : " + modelName);
		System.out.println("차량 가격 : " + price + "원");
		System.out.println("차량 연식 : " + modelYear + "년식");
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.Print();
		
		System.out.println();
		
		Car car2 = new Car("벤츠", 100000000, 2021);
		car2.Print();
		
		
		
		
		
		
		
		
		
		
		
	}
}
