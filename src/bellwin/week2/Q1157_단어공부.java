package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Character, Integer> info = new HashMap<>();

        // 대문자와 소문자를 구분하지 않으므로 대문자로 통일 (어차피 정답을 대문자로 출력해야 하니까)
        String str = st.nextToken().toUpperCase();

        // 길이가 1인 문자열은 비교할 필요 없으므로, 그대로 출력 후 return
        if (str.length() == 1){
            System.out.println(str);
            return;
        }

        // Map에 알파벳과 입력 횟수를 key-value로 저장
        // getOrDefault 메서드로 반복되는 문자 count++
        for (char c : str.toCharArray()){
            info.put(c, info.getOrDefault(c, 0) + 1);
        }

        // Map의 key인 알파벳을 List로 변환
        // 이유: Map 자료구조는 정렬이 불가하므로, key 값들을 List에 삽입 후
        // map의 value를 기준으로 내림차순 정렬 (value가 큰 순서대로 정렬)
        List<Character> alphabets = new ArrayList<>(info.keySet());

        // 리스트의 크기가 1일 경우(문자열이 모두 같은 문자로 이루어져 있다면), 첫번째 요소 출력 후 종료
        // 이거 처리 안해줘서 런타임 에러(IndexOutOfBounds Exception) 떴음.
        if (alphabets.size() == 1){
            System.out.println(alphabets.get(0));
            return;
        }
        alphabets.sort((o1, o2) -> info.get(o2).compareTo(info.get(o1)));

        // List 1,2번째 key 값으로 map의 value를 비교했을 때 같으면 최빈값이 두 개 이상이므로 "?" 출력
        if (info.get(alphabets.get(0)).equals(info.get(alphabets.get(1)))) {
            System.out.println("?");
        } else {
            System.out.println(alphabets.get(0));
        }
    }
}
