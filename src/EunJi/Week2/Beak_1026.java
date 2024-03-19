package EunJi.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Beak_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        Integer[] B = new Integer[n];
        StringTokenizer str_A = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str_A.nextToken());
        }
        StringTokenizer str_B = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(str_B.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(B, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = answer + A[i]*B[i];
        }
        System.out.println(answer);

    }
}
