package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		
		Coffee ethiopiaAmericano = new EthiopiaAmericano();
		//ethiopiaAmericano.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		
		System.out.println();
		
		Coffee kenyaMocha = new Mocha(new Latte(kenyaAmericano));
		kenyaMocha.brewing();
		
		System.out.println();
		
		Coffee ethiopiaCreamMocha = new WithCream(new Mocha(new Latte(new EthiopiaAmericano())));
		ethiopiaCreamMocha.brewing();
	}

}
