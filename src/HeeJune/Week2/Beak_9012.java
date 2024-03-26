package HeeJune.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Beak_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String a = br.readLine();
            System.out.println(checkVPS(a));
        }
    }
    public static String checkVPS (String a){
        String [] temp = a.strip().split("");
        Stack<String> check = new Stack<>();
        for(int i=0; i<temp.length; i++){
            if(temp[i].equals("(")){
                check.add(temp[i]);
            }
            if(temp[i].equals(")")){
                if(!check.empty()){
                    check.pop();
                } else{
                    return "NO";
                }
            }
        }
        if(!check.empty()){
            return "NO";
        }
        return "YES";
    }
}
