package ko.co.ezenac.arraylist;

import java.util.ArrayList;

import ko.co.ezenac.array03.Book;

public class ArrayListTest {
		
	public static void main(String[] args) {
		ArrayList<Book> libray = new ArrayList<>();
		libray.add(new Book("그림으로 배우는 StatQuest 머신러닝 강의", "조시 스타머"));
		libray.add(new Book("그림으로 배우는 StatQuest", "조시"));
		libray.add(new Book("그림으로 배우는 StatQuest2", "조시2"));
		libray.add(new Book("그림으로 배우는 StatQuest3", "조시3"));
		libray.add(new Book("그림으로 배우는 StatQuest4", "조시4"));
		
		for(int i=0; i<libray.size(); i++) {
			libray.get(i).showInfo();			
		}
	}
}
























