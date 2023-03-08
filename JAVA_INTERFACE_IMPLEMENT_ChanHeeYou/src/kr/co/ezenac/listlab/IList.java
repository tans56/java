public interface IList<T> {

    void addList(T t);                  //리스트에 요소를 추가하는 메소드 (순차적 삽입)

    void insertList(int index, T t);    //특정 index에 요소를 추가하는 메소드 (특정 순번째에 삽입)

    void clearList();                   // 리스트 초기화 하는 메소드 (리스트 초기화하기)

    boolean deleteByElement(T t);                // 리스트의 요소 삭제하는 메소드 (요소 삭제)

    boolean deleteByIndex(int index);           // 특정 index 삭제하는 메소드 (특정 순번째 삭제)

    T get(int index);                           // 특정 index에 있는 요소 가져오는 메소드 (특정 순번째 데이터 리턴)

    int indexOfReturn(T t);                     // 요소의 index값 리턴해주는 메소드(특정 요소의 순번 리턴)

    boolean isEmptyList();                      // 리스트가 비어있는지 확인하는 메소드

    boolean containsElement(T t);               // 리스트에 요소가 있는지 확인하는 메소드 (특정 요소 포함 확인하기)

    int size();                                 // 리스트에 들어있는 요소의 갯수 리턴해주는 메소드 (요소 사이즈 확인하기)

    void printAllElement();                     // 리스트의 모든 요소 출력해주는 메소드 (리스트 내용 출력하기 )
}
