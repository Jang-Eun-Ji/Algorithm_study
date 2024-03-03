package EunJi.Week1;


import java.util.Arrays;
import java.util.Scanner;

public class Beak_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] man = new int[9];
        int fake1 = 0;
        int fake2 = 0;
        int total = 0;
        for (int i = 0; i < 9; i++) {
            man[i] = sc.nextInt();
            total = total + man[i];
        }
        Arrays.sort(man);
        loop:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(man[i]+man[j] == (total - 100) && j != i){
                    fake1 = i;
                    fake2 = j;
                    break loop;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if( fake1 != i && fake2 != i ){
                System.out.println(man[i]);
            }
        }

    }

}

