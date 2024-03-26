package HeeJune.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beak_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 대문자로 모두 치환
        String a = br.readLine().toUpperCase();
        //리스트 두개 셋팅
        List<String> myList = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            // 알파벳인 경우만 처리
            if (Character.isLetter(c)) {
                String s = String.valueOf(c);
                //리스트에 각 문자가 있는지 확인한 후에 알파벳 담는 list에 알파벳 추가, 개수 담는 리스트에 횟수 추가
                if (!myList.contains(s)) {
                    myList.add(s);
                    counts.add(1);
                } else {
                    int index = myList.indexOf(s);
                    counts.set(index, counts.get(index) + 1);
                }
            }
        }
        //최빈값, 최대값의 index 값, 답 출력하기 위해 boolean 셋팅
        int maxCount = 0;
        int maxIndex = -1;
        boolean answer = false;
        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i) > maxCount) {
                maxCount = counts.get(i);
                maxIndex = i;
                answer = false;
            } else if (counts.get(i) == maxCount) {
                answer = true;
            }
        }

        if (answer) {
            System.out.println("?");
        } else {
            System.out.println(myList.get(maxIndex));
        }
    }
}
