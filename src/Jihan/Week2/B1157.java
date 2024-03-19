import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B1157 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            int temp = s.charAt(i)-'0';
            if(temp>=49){
                if(myMap.containsKey(temp-32)){
                    myMap.put(temp-32,myMap.get(temp-32)+1);
                }else{
                    myMap.put(temp-32,1);
                }
            }else{
                if(myMap.containsKey(temp)){
                    myMap.put(temp,myMap.get(temp)+1);
                }else{
                    myMap.put(temp,1);
                }
            }
        }
        int max = 0;
        char answer = '?';
        for(Integer a : myMap.keySet()){
            if(max<myMap.get(a)){
               max = myMap.get(a);
               answer = (char) (a + '0');
            }else if( max == myMap.get(a)){
                answer = '?';
            }
        }
        System.out.println(answer);

    }
}
