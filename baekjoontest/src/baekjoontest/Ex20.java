package baekjoontest;
// 백준 2442번 별찍기 -5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
