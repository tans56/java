package baekjoontest;
// 백준 2439번 별찍기-2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=N-i-1; j>0; j--) {
                System.out.print(" ");
            }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
