package kr.co.ezenac.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<>();
		powerPrinter.setMaterial(new Powder());
		Powder powder = powerPrinter.getMaterial();		//형변환 하지 않음
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();	//형변환 하지 않음
		System.out.println(plasticPrinter);
		
		//GenericPrinter<Water> printer = new GenericPrinter<>();
		GenericPrinter powerPrinter2 = new GenericPrinter(); 
		powerPrinter2.setMaterial(plastic);
		
	}
}
