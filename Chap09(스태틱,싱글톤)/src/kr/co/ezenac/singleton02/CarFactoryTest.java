package kr.co.ezenac.singleton02;

/*
 * 자동차 공장이 있습니다.
 * 자동차 공장은 유일한 객체이고, 이공장에서 생산되는 자동차는 생산될 때마다
 * 고유의 일련번호가 부여됩니다.
 * 
 * 자동차 일련번호가 1001부터 시작되어 차가 생산될때마다 1002, 1003번
 * 이렇게 번호가 부여되도록
 * 
 * 자동차공장 클래스(싱글톤 패턴), 자동차 클래스(static 변수)를 구현하시오.
 * 
 * 
 */

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory carFactory = CarFactory.getInstance();
		Car bMWix = carFactory.createCar();
		Car bMWi4 = carFactory.createCar();
		
		System.out.println(bMWix.getCarNum());
		System.out.println(bMWi4.getCarNum());
	}
}













