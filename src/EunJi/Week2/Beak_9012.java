package EunJi.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            if(temp.charAt(0) != '(' || temp.charAt(temp.length()-1) != ')'){
                System.out.println("NO");
            }else {
                int count= 0;
                for (int j = 0; j < temp.length(); j++) {
                    if(temp.charAt(j) == '('){
                        count ++;
                    }
                    if(temp.charAt(j) == ')'){
                        count --;
                    }
                }
                if(count == 0){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }

        }

    }
}
