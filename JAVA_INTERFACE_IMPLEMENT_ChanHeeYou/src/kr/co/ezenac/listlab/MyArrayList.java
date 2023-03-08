package kr.co.ezenac.listlab;

import java.util.Arrays;

public class MyArrayList <T> implements IList<T>{
    private static final int DEFAULT_SIZE = 50;                     //리스트의 기본 사이즈를 상수로 선언
    private  int size;

    private T[] elements;

    public MyArrayList(){       //생성자
        this.size = 0;                                      // 초기화
        this.elements = (T[])new Object[DEFAULT_SIZE];      // 초기화
    }

    @Override
    public void addList(T t) {
        if(this.size == this.elements.length) {     //예외처리
            this.elements = Arrays.copyOf(this.elements, this.size *2); //리스트를 복사하고 2배로 늘림
        }
        this.elements[this.size] = t;
        this.size += 1;
    }

    @Override
    public void insertList(int index, T t) {
        if(this.size == this.elements.length){      //예외처리
            this.elements = Arrays.copyOf(this.elements, this.size *2); //리스트를 복사하고 2배로 늘림
        }

        for(int i=size-1; i>= index; i--){ //index번째 기준 맨끝에서 부터 이동
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = t;
        this.size ++;
    }

    @Override
    public void clearList() {       //리스트를 초기 상태로 만듬
        this.size = 0;
        this.elements = (T[])new Object[DEFAULT_SIZE];
    }

    @Override
    public boolean deleteByElement(T t) {       //리스트의 요소 삭제
        for(int i=0; i<this.size; i++){
            if(this.elements[i].equals(t)){     //같은 요소가 있는지 확인 (예외처리)
                for(int j=1; j<this.size - 1; j++){
                    this.elements[j] = this.elements[j+1];      //왼쪽으로 시프트
                }
                this.size --;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {      //특정 index에 있는 요소를 삭제
        if(index < 0 || index > this.size - 1){     //예외처리
            return false;
        }
        for(int i= index; i< this.size -1; i++){
            this.elements[i] = this.elements[i + 1];            //왼쪽으로 시프트
        }
            this.size--;
        return true;
    }

    @Override
    public T get(int index) {       //특정 index에 있는 요소 가져오기
        if(index < 0 || index > this.size -1)       //예외처리
            throw new IndexOutOfBoundsException();      //throw Exception을 사용해 예외처리
        return this.elements[index];                //특정 index에 요소가 있으면 요소를 반환
    }

    @Override
    public int indexOfReturn(T t) {     //요소의 index값 가져오기
        for(int i=0; i< this.size; i++){
            if(this.elements[i].equals(t)){         // 리스트 .equals(t)로 요소가 배열에 있는지 확인
                return  i;                          // 있다면 i를 반환해 idex값을 반환
            }
        }
        return -1;                      // 리스트에 요소가 없으면 없는값 -1를 반환해 종료
    }

    @Override
    public boolean isEmptyList() {      //리스트가 비어있는지 확인
        return this.size == 0;
    }

    @Override
    public boolean containsElement(T t) {      // 리스트에 요소가 있는지 확인
        for(int i=0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {             // 리스트 .equals(t)로 배열에 요소가 있으면
                return true;                            // true를 반환 없으면 false를 반환

            }
        }
        return false;
    }

    @Override
    public int listSize() {         //리스트에 있는 요소 갯수(크기) 확인
        return this.size;
    }

    @Override
    public void printAllElement() {        // 리스트의 모든 요소 출력
        if(isEmptyList() == true){                      //예외처리
            System.out.println("출력할 내용이 없습니다.");
        }
        for(int i=0; i<this.size; i++){
            System.out.println(this.elements[i] + " ");
        }
        System.out.println();
    }
}
