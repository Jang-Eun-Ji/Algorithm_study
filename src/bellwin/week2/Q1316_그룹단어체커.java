package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1316_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        // 그룹 단어인지 체크하는 변수
        boolean isGroup = false;

        for (int i = 0; i < N; i++){
            List<Character> alphabets = new ArrayList<>();

            // 가장 최근에 저장된 문자
            // 알파벳이 아닌 문자로 초기화해주어, 첫번째로 검사할 알파벳과 비교할 수 있도록 함
            char latest = '0';

            // 새로운 문자열 입력 받기
            st = new StringTokenizer(br.readLine());
            for (char c : st.nextToken().toCharArray()){

                // 알파벳이 latest와 다르면서 alphabets에 포함되어 있다면 그룹 단어가 아니므로, break
                if (alphabets.contains(c) && c != latest) {
                    isGroup = false;
                    break;
                }
                latest = c;
                alphabets.add(c);
                isGroup = true;
            }
            // 위의 for문이 중간에 break 없이 전부 순회하면 isGroup이 true 상태임
            // isGroup이 true면 그룹 단어이므로 갯수 1 증가
            if (isGroup){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
