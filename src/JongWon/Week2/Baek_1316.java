package JongWon.Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baek_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] seen = new boolean[26];
            boolean isGroupWord = true;
            char prev = '0';

            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);
                if (prev != current) {
                    if (seen[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    seen[current - 'a'] = true;
                }
                prev = current;
            }

            if (isGroupWord) {
                groupWordCount++; // 그룹 단어 개수 증가
            }
        }

        System.out.println(groupWordCount);
    }
}

//1157번을 응용해서 풀어봤음.
//요점은 기존에 있던것들이 이어지고, 그뒤로 추가로 이어지는건데 기존에 있던 문자가 다시나오면 연속그룹이 아니라는거니까
//뭔가 시간을 조금 줄이고 싶어서 주석을 좀 더 정리하고 지워봤는데 효과가 있긴함..



