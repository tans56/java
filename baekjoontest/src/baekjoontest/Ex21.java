package baekjoontest;
//백준 2443번 별찍기 -6
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
