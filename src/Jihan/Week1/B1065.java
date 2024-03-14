import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        if(Integer.parseInt(n)<100){
            System.out.println(n);
        }else{
            int answer = 99;
            for(int i=100; i<=Integer.parseInt(n); i++){
                String temp = Integer.toString(i);
                int k = temp.charAt(0) - temp.charAt(1);
                for(int j=1; j<temp.length()-1; j++){
                    if(k==temp.charAt(j) - temp.charAt(j+1)){
                        answer ++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
