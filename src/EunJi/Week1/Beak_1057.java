package EunJi.Week1;

import java.util.Scanner;

public class Beak_1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        while (!(a==b)){
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }

        System.out.println(answer);
    }

}

