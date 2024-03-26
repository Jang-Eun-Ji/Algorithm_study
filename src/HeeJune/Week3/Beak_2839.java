package HeeJune.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int m = N / 5;
        System.out.println(solution(N,m));
    }
    public static int solution(int N, int m){
        for (int i = m; i >= 0; i--) {
            if ((N - i * 5) % 3 == 0) {
                int l = (N - i * 5) / 3;
                return i + l;
            }
        }
        return -1;
    }
}
