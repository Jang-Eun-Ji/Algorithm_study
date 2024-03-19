package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++){

            // 스택 사용
            Stack<Character> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            for (char c : st.nextToken().toCharArray()){
                // 스택이 비었을 때 들어갈 문자가 ')'이면 push하고 바로 break 처리해서
                // for문 밖에 있는 검증 절차로 이동시키기 -> 스택이 비어있지 않기 때문에 NO 출력됨
                if (stack.isEmpty()){
                    if (c == '('){
                        stack.push(c);
                        continue;
                    } else {
                        stack.push(c);
                        break;
                    }
                }

                // 스택에서 가장 위에 있는 '('가 push 될 문자와 다르면 짝이 맞으므로 pop
                // 비어있지 않은 스택에서는 ')'이 들어갈 수 없음. 바로 pop 시켜 버리기 때문
                if (c != stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
