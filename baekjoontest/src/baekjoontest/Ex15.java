package baekjoontest;

import java.io.*;
import java.util.Arrays;
                    // 백준 2309번 일곱난쟁이 브론즈1
public class Ex15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = new int[9];
        int sum = 0;
        int fake1 =0, fake2=0;

        for(int i=0; i<N.length; i++){                  // 받은 값을 배열에 int 형으로 형변화 후 대입
             N[i] = Integer.parseInt(br.readLine());
             sum += N[i];                               // 요소들을 sum 변수에 더함
        }
        Arrays.sort(N);                                 // 배열 오름차순으로 정렬

        for(int i=0; i<N.length; i++){                  // 요소 전부 더한값(sum) - 배열 i 번째와 j 번째를 전부 빼서 100이랑 비교
            for(int j= i+1; j<N.length; j++){
                if(sum - N[i] - N[j] == 100){           // 100이 맞다면 배열 i 번째와 j 번째는 가짜이므로 0으로 할당
                    fake1 = N[i];
                    fake2 = N[j];
                }
            }
        }
        for(int i = 0; i<N.length; i++) {                   // 요소값이 0이면 가짜이므로 제외하고 출력
           if(fake1 == N[i] || fake2 == N[i]) continue;
            System.out.println(N[i]);
        }
    }
}
