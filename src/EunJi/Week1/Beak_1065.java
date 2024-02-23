package EunJi.Week1;

import java.util.Scanner;

public class Beak_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        if(num <= 99){
            answer = num;
        }else if(num <= 110){
            answer = 99;
        }else if(num == 1000){
            answer = 144;
        }else {
            answer = 99;
            for (int i = 111; i <= num; i++) {
                int temp100 = i/100;
                int temp10 = i/10 - 10*temp100;
                int temp1 = i%10;
                if(temp1 -temp10 == temp10 -temp100){
                    answer ++;
                }
            }
        }
        System.out.println(answer);

    }
}
