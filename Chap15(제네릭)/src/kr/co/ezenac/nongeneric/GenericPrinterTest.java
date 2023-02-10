package kr.co.ezenac.nongeneric;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<>();
		powerPrinter.setMaterial(new Powder());
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
	}
}
