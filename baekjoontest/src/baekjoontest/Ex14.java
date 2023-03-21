package baekjoontest;
// 백준 2387번 대표값2
import java.io.*;
import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;            //합계 변수 
        int mid = 0;            // 중앙값 변수
        int[] arr = new int[5]; // 배열선언

        for (int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());   // int형으로 형변환 후 배열에 넣기
            sum += arr[i];                              // 배열의 각 요소를 sum변수에 더해 넣기
        }
        Arrays.sort(arr);                               // 배열 오름차순으로 정렬
        int avg = sum /5;                               // 평균을 구해 avg변수 선언
        mid = arr[2];                                   // 중앙은 2번째 인덱스에 있으므로 mid변수에 대입

        bw.write(avg + "\n");                       // 평균값 출력
        bw.flush();
        bw.write(mid + "\n");                       // 중앙값 출력
        bw.flush();
    }
}
