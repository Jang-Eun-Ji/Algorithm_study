import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int temp_c = 1;
            Map<Character, Integer> temp = new HashMap<>();
            for(int j=0; j<s.length(); j++){
                if(!temp.containsKey(s.charAt(j))){
                    temp.put(s.charAt(j),j);
                }else{
                    if(temp.get(s.charAt(j))-j != -1){
                        temp_c = 0;
                        break;
                    }else{
                        temp.put(s.charAt(j),j);
                    }
                }
            }
            answer += temp_c;
        }
        System.out.println(answer);
    }
}
