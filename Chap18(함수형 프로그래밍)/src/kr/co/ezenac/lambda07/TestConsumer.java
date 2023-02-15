package kr.co.ezenac.lambda07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		
		Consumer<String> myConsumer = str -> System.out.println(str);
		myConsumer.accept("Good Afternoon!");
		myConsumer.accept("Seoul Korea!");
		
		List<Integer> list = Arrays.asList(4, 2, 3);				//immutable
		
		Consumer<Integer> myConsumer2 = x -> System.out.println("정수형 입력 처리 : " + x);
		myConsumer2.accept(23);
		
		System.out.println();
		
		consumerAccept(list, myConsumer2);
		
		System.out.println();
		
		List<Double> dlist = Arrays.asList(1.1, 2.2, 3.3);
		
		Consumer<Double> myConsumer3 = d -> System.out.println("더블형 리스트 입력 처리 : " + d);
		
		consumerAccept(dlist, myConsumer3);
		
	}
	
	public static<T> void consumerAccept(List<T> inputs, Consumer<T> consumer) {
		for(T input : inputs)	
			consumer.accept(input);
	}
}
