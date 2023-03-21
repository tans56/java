package baekjoontest;
// 백준 2576번 홀수
import java.io.*;

public class Ex13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = 100;            //최대값 변수
        int sum = 0;            // 합계 변수

        for(int i=0; i<7; i++) {                                // 입력받는 숫자가 7개 이므로 조건문에 7넣음
            int num = Integer.parseInt(br.readLine());          //  int형으로 형변환 후 변수num 선언
            if (num % 2 == 1) {                                 // 홀수 구하는 조건
                sum += num;                                     // 홀수면 sum변수에 더하여 대입
                min = Math.min(min,num);                        // num과 min중에 작은수를 min에 대입
            }
        }
        if(sum == 0){                                           // sum이 0이면 홀수가 없는것 이므로 -1을 출력
            bw.write(-1+ "\n");
            bw.flush();
        }else {
            bw.write(sum + "\n");                           // 합계를 출력
            bw.flush();
            bw.write(min + "\n");                           // 최소값 출력
            bw.flush();
        }
    }
}
