package bellwin.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Character>> alphabets = new ArrayList<>(); // 2차원 리스트 선언
        StringBuilder sb = new StringBuilder(); // 문자를 이어붙이는 용도
        int len = 5; // 최대 다섯줄의 입력만 주어짐

        int max = Integer.MIN_VALUE; // 입력된 라인 중 가장 긴 라인의 길이

        // 글자들을 입력 받아 이중 리스트에 세팅
        for (int i = 0; i < len; i++){
            alphabets.add(new ArrayList<>());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (char c : st.nextToken().toCharArray()){
                alphabets.get(i).add(c);
            }

            // 가장 긴 라인의 길이 세팅하는 로직
            if (alphabets.get(i).size() > max){
                max = alphabets.get(i).size();
            }
        }

        // max 길이보다 작은 라인을 *로 채움
        for (List<Character> line : alphabets){
            while (line.size() < max){
                line.add('*');
            }
        }

        // 글자가 *이 아니라면 StringBuilder에 글자 이어붙이기
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < len; j++) {
                if (alphabets.get(j).get(i) != '*'){
                    sb.append(alphabets.get(j).get(i));
                }
            }
        }
        System.out.println(sb);
    }
}
