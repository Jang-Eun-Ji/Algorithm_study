import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class B9012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String s = br.readLine();
            Deque<Character> myDeque = new ArrayDeque<>();
            for(int j=0; j<s.length(); j++){
                if(!myDeque.isEmpty()){
                    if(myDeque.peek() == '(' && s.charAt(j) == ')'){
                        myDeque.pollLast();
                    }else{
                        myDeque.addLast(s.charAt(j));
                    }
                }else{
                    myDeque.addLast(s.charAt(j));
                }
            }
            if(!myDeque.isEmpty()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
