package kr.co.ezenac.listlab;

public class MyArrayListTest {
    public static void main(String[] args) {
        IList<String> ezenList = new MyArrayList<>();

        System.out.println("===(순차적 삽입)===");
        ezenList.addList("나희도");
        ezenList.addList("백이진");
        ezenList.addList("고유림");
        ezenList.addList("문지웅");
        ezenList.addList("지승완");
        ezenList.printAllElement();

        System.out.println("===(특정 순번째에 삽입)===");
        ezenList.insertList(2,"국연수");
        ezenList.printAllElement();

        System.out.println("===리스트 초기화하기===");
        ezenList.clearList();
        ezenList.printAllElement();

        System.out.println("===데이터 삭제하기 (요소 삭제)===");
        IList<Integer> ezenList2 = new MyArrayList<>();
        ezenList2.addList(10);
        ezenList2.addList(20);
        ezenList2.addList(30);

        ezenList2.deleteByElement(20);
        ezenList2.printAllElement();

        System.out.println("===데이터 삭제하기 (특정 순번째 삭제)===");
        ezenList2.deleteByIndex(0);
        ezenList2.printAllElement();

        System.out.println("===(특정 순번째 데이터 리턴)===");
        IList<String> ezenList3 = new MyArrayList<>();
        ezenList3.addList("이재성");
        ezenList3.addList("이이슬");
        ezenList3.addList("최웅");
        System.out.println(ezenList3.get(2));
        System.out.println();

        System.out.println("===(특정 요소의 순번 리턴)===");
        System.out.println(ezenList3.indexOfReturn("이이슬"));
        System.out.println();

        System.out.println("===리스트 비어있는지 확인하기===");
        System.out.println(ezenList3.isEmptyList());
        System.out.println();

        System.out.println("===특정 요소 포함 확인하기===");
        System.out.println(ezenList3.containsElement("최웅"));
        System.out.println();

        System.out.println("===요소 사이즈 확인하기===");
        System.out.println(ezenList.listSize());
        System.out.println();

        System.out.println("===리스트 내용 출력하기===");
        ezenList.printAllElement();
        ezenList2.printAllElement();
        ezenList3.printAllElement();
    }
}
