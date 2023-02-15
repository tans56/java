package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//정수 배열에 스트림 생성하여 연산 수행
public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		for(int a : arr)
//			System.out.println(a);
		
		int sumResult = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		Arrays.stream(arr).forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		System.out.println(sumResult);
		System.out.println(count);
		
		System.out.println();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
			
		
		int sum = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum);
		
		
		
		
		
	}
}
