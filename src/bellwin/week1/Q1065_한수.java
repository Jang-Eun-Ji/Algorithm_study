package bellwin.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1065_한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int answer = 0;

        // 1 ~ 99까지는 모두 각 자리가 등차수열을 이루는 한 수임
        if (number.length() <= 2){
            System.out.println(number);
            return;
        }

        for (int i = 100; i <= Integer.parseInt(number); i++){
            String[] sp = String.valueOf(i).split("");
            int first = Integer.parseInt(sp[0]);
            int second = Integer.parseInt(sp[1]);
            int third = Integer.parseInt(sp[2]);

            // 각 자리의 수가 오름차순이거나 내림차순이고,
            // 인접한 자릿수의 차의 절대값끼리의 차가 0일 때, 한 수
            if (first <= second && second <= third && (Math.abs(first - second)) - (Math.abs(second - third)) == 0){
                answer++;
            } else if (first >= second && second >= third && (Math.abs(first - second)) - (Math.abs(second - third)) == 0) {
                answer++;
            }
        }
        // 입력값이 세자리수 이상이면 기본적으로 한 수를 99개 갖고있다.
        System.out.println(answer + 99);
    }
}
