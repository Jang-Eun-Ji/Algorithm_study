package EunJi.Week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class  Beak_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total_number = n;

        for (int j = 0; j < n; j++) {
            String st = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < st.length(); i++) { // char이 바로 앞에 중복되는것을 제외한 상태에서 map key가 있는 것을 호출하면 바로 false나옴
                char temp = st.charAt(i);
                if(!map.containsKey(temp)){ // map안의 char가 없으면
                    map.put(temp, i);
                }else if(map.get(temp) == i-1){ // map안에 char가 있고 그게 앞에 있는 즉 연속된 char이면 새로운 index를 value값으로 갖는다
                    map.put(temp,i);
                }else{ // map안에 temp값을 가진 key가 있고 그게 연속된 숫자 이면 멈춤
                    total_number = total_number - 1;
                    break;
                }
            }
        }
        System.out.println(total_number);

    }

}

