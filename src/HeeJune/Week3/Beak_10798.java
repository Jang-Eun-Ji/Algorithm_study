package HeeJune.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beak_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st1 = br.readLine();
        String st2 = br.readLine();
        String st3 = br.readLine();
        String st4 = br.readLine();
        String st5 = br.readLine();
        String answer="";
        for(int i=0; i<15; i++){
            if(i<st1.length()){
                answer+= Character.toString(st1.charAt(i));
            }
            if(i<st2.length()){
                answer+= Character.toString(st2.charAt(i));
            }
            if(i<st3.length()){
                answer+= Character.toString(st3.charAt(i));
            }
            if(i<st4.length()){
                answer+= Character.toString(st4.charAt(i));
            }
            if(i<st5.length()){
                answer+= Character.toString(st5.charAt(i));
            }
        }
        System.out.println(answer.strip());
    }
}
