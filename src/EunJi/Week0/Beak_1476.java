package EunJi.Week0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Beak_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int countE = 0;
        int countS = 0;
        int countM = 0;
        int answer = 0;
        while (!(e == countE && s == countS && m == countM)){
            countE++;
            countS++;
            countM++;
            if(countE > 15){
                countE = 1;
            }
            if(countS > 28){
                countS = 1;
            }
            if(countM > 19){
                countM = 1;
            }
            answer++;
        }
        System.out.println("answer = " + answer);


    }
}

