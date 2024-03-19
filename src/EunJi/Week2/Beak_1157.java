package EunJi.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;


public class Beak_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
//                알파벳 , 갯수
        for (int i = 0; i < a.length(); i++) {
            int N = a.charAt(i);
            if (N > 96) { // 대문자 변환
                N -= 32;
            }
            char A = (char) N;
            if (!map.containsKey(A)) { // map에 대문자 알파벳이 없으면 value에 숫자를 넣는다.
                map.put(A, 1);
            } else { // 있으면 숫자를 1개씩 더해준다.
                int value = map.get(A) + 1;
                map.put(A, value);
            }
        }
        Integer maxValue = Collections.max(map.values());
        int boom = 0; // 최다 알파벳의 갯수
        char answer = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) == maxValue) {
                answer = key;
                boom++;
            }
            if (boom > 1) { // 1개 초과면 터짐
                answer = '?';
                break;
            }

        }
        System.out.println(answer);

    }
}