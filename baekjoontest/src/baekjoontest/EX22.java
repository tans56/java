package baekjoontest;
//백준 2444번 별찍기 -7
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)-3; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
