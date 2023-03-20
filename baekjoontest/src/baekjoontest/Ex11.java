package baekjoontest;

import java.io.*;

// 백준 2490번 윷놀이 브론즈3
public class Ex11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i = 0; i < 3; i++) {        // 입력 받은 값을 split으로 공백 제거후 배열에 삽입
            String[] arr = br.readLine().split(" ");

            int count = 0;
            for (int j = 0; j < arr.length; j++) {   // parseInt로 int형으로 변환후 j번째에 있는 요소가 0이랑 같은지 비교
                if (Integer.parseInt(arr[j]) == 0) {
                    count++;
                }
            }
            String str = "";
            switch (count) {    // switch 문으로 count 변수 값에 맞게 str 변수 초기화
                case 0:
                    str = "E";
                    break;
                case 1:
                    str = "A";
                    break;
                case 2:
                    str = "B";
                    break;
                case 3:
                    str = "C";
                    break;
                default:
                    str = "D";
                    break;
            }
            bw.write(str + "\n");   //출력
            bw.flush();
        }
    }
}
