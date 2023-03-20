package baekjoontest;


import java.io.*;

// 백준 2562번 최대값 브론즈3
public class Ex12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= 9;       //입력갑 9개
        int max = 0;    //최대값 변수
        int loc = 0;    //입력순서 변수

        for(int i=0; i < n; i++){
            int num = Integer.parseInt(br.readLine());  //Integer.parseInt로 입력받은 문자열을 int형으로 변환후 num에 초기화
            if(max < num){          //max 변수에 값을 대입하여 제일 큰 수를 찾아냄
                max = num;
                loc = (i+1);        // 제일 큰수가 나왔을때 i번째 +1
            }
        }
        bw.write(max + "\n"); // 제일 큰수 출력
        bw.flush();
        bw.write(loc + "\n"); // 제일 큰수의 자리값 출력
        bw.flush();
    }
}
