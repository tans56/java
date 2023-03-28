package baekjoontest;
// 백준 2441번 별찍기 -4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=N; i>=1; i--){
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

