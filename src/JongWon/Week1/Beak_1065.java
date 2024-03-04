package JongWon.Week1;

import java.util.Scanner;

public class Beak_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i < 100) {
                // 100미만의 수는 모두 한수
                count++;
            } else {
                int hundred = i / 100; // 백의 자리
                int ten = (i / 10) % 10; // 십의 자리
                int one = i % 10; // 일의 자리
                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }

//    *한수의 개념 : 자리수끼리 차이가 일정, 두자리 수는 비교할 자리수가 없고 하나의 차이만 존재하기 때문에 한 수.
//    따라서 99까지는 모두 한 수.
//    그 뒤로는 각 자리수마다 크기 비교, ex) 102 =  1-0, 0-2 -> 한 수 아님
//    123 = 1-2, 2-3, |1| 차이 남 ->한 수
//    문제해석이 더럽게 어렵다.

}
