package HeeJune.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beak_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //숫자 배열화
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        //A의 최솟값 출력-> PriorityQueue 활용
        Queue<Integer> A = new PriorityQueue<>();
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st1.nextToken()));
            B[i] = Integer.parseInt(st2.nextToken());
        }
        ;
        int[] B2 = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).mapToInt(a -> a).toArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A.poll() * B2[i];
        }
        System.out.println(sum);
    }
}