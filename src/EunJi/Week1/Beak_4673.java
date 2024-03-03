package EunJi.Week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Beak_4673 {
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i < 10001; i++) {
            temp.add(i);
        }
        for (int i = 0; i < 10001; i++) {
            int temp_num = i;
            while (i != 0){
                temp_num += i%10;
                i = i/10;
            }
            temp.remove(Integer.valueOf(temp_num));
        }
        System.out.println("temp = " + temp);
    }

}

