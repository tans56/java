package kr.co.ezenac.set02;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("이순신");
		treeSet.add("류성룡");
		treeSet.add("신사임당");
		treeSet.add("신사임당");
		
		// String 클래스는 이미 Comparable 인터페이스가 구현되어 있으므로 
		// 오름차순으로 정렬되어 출력됨
		for(String str : treeSet)
			System.out.println(str);

	}

}
