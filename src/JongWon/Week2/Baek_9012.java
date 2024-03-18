package JongWon.Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baek_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        testCases:
        for (int t = 0; t < T; t++) {
            String s = br.readLine();
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    count++; // 여는 괄호
                } else if (c == ')') {
                    count--; // 닫는 괄호
                    if (count < 0) { // 닫는 괄호가 더 많아지면 VPS가 아님
                        System.out.println("NO");
                        continue testCases;
                    }
                }
            }

            if (count != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}

//앞에 그 최소값찾는 문제풀다가 이거푸니까 좀 할만 헀다.
//뭔가 그렇게 어렵지는 않았다.
