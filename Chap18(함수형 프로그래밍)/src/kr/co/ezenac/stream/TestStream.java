package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("뉴질랜드 사이클론에", "국가비상사태 선포", "뉴질랜드 역사상 세 번째");
		
		List<String> str = strStream.collect(Collectors.toList());
		System.out.println(str);
		System.out.println();
		
		String[] cityArray = new String[] {"서울", "뉴욕", "시드니"};
		Stream<String> cityStream = Arrays.stream(cityArray);
		List<String> cityList = cityStream.collect(Collectors.toList());
		System.out.println(cityList);
	}
}
