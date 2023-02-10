package kr.co.ezenac.generic;

//이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정
/*
 * 	E : element, K : key, V : value
 */
public class GenericPrinter<T extends Material> {	
	private T material;			// 제네릭 자료형 , T 자료형으로 선언 변수

	public T getMaterial() {	// T 자료형을 반환 하는 제네릭 메서드
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		 return material.toString();
	}
	
	
	public void printing(){
		material.doPrint();
	}
	
}
