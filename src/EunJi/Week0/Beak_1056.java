package EunJi.Week0;

import java.util.Scanner;

public class Beak_1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int closeNum = 2;
        int answer = 1;
        while (closeNum < num){
            closeNum = closeNum* closeNum; // 여기서 closeNum은 num보다 큼
        }
        System.out.println("closeNum = " + closeNum);
        if(closeNum - num > num - closeNum/2){
            answer = answer + (num - closeNum/2);
        }else {
            answer = answer + (closeNum - num);
        }

        System.out.println(answer);
    }

}

