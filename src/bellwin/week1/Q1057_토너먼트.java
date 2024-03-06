package bellwin.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1057_토너먼트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 참가자 수
        int kim  = Integer.parseInt(st.nextToken()); // 김지민의 번호
        int lim = Integer.parseInt(st.nextToken()); // 임한수의 번호
        int round = 1; // 시작 라운드

        // 김지민과 임한수의 번호가 짝수일 경우 번호는 2로 나눈 몫으로 세팅
        // 홀수의 경우 2로 나눈 몫 + 1로 세팅
        int kNumber = kim % 2 == 0 ? kim / 2: kim / 2 + 1;
        int lNumber = lim % 2 == 0 ? lim / 2: lim / 2 + 1;

        // 참가자의 수가 1명 미만이 될 경우 while문 탈출
        while (N >= 1){

            // 다음 라운드에 김지민과 임한수의 번호가 같으면 대결하므로 정답 출력 후 종료
            if (kNumber == lNumber){
                System.out.println(round);
                return;
            }
            // 그렇지 않으면 라운드 회차 1 증가
            round++;

            kNumber = kNumber % 2 == 0 ? kNumber / 2: kNumber / 2 + 1;
            lNumber = lNumber % 2 == 0 ? lNumber / 2: lNumber / 2 + 1;

            // 토너먼트 방식이므로 매 라운드 마다 인원 수는 1/2씩 감소
            N /= 2;
        }

        // 동일 라운드에서 대결하지 못할 경우 -1 출력
        System.out.println(-1);
    }
}
