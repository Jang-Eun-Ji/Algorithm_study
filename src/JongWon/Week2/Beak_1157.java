package JongWon.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beak_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }

}

//여러번 사용된 알파벳이 여러개 일때 = ?, 한가지 종류면 그 문자 출력
//대소문자 구분? -> 하는거보다 그냥 한쪽으로 치우쳐 지게 하는게 맞는거 같음
//결국 각 문자가 몇번 나왔는지 세는거기때문에 각 문자별 횟수를 카운팅 하면 됨-> 문자마다 번호를 줘서 카운팅함
//여러개 일 경우 ?가 돼야하니까 같은경우는 ? 하면 됨
//BufferedReader와 InputStreamReader 클래스는 예외상황(IOException)이 발생할 수 있어 throws IOException 해줘야함 -> 걍 썼는데 ->이유.
//또 생각없이 Scanner로 구현했는데 약속했던게 떠올라서 BufferedReader를 사용했다.
