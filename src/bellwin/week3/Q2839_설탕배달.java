package bellwin.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        // N이 3보다 작으면 -1 return
        if (N < 3){
            System.out.println(-1);
            return;
        }

        while(N > 0){
            // N이 5의 배수이면 나눈 몫을 answer에 더해주고 answer 출력 후 종료
            if (N % 5 == 0){
                answer += N / 5;
                System.out.println(answer);
                return;
            }
            N -= 3;
            answer++;
        }

        if (N == 0){
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
