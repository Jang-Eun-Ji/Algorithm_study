package JongWon.Week1;

import java.util.Scanner;

public class Baek_1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int round = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            round++;
            // 만약 N이 2보다 작아지면 대결하지 않는 경우로 간주할 수 있음
            if (number < 2) {
                round = -1;
                break;
            }
        }
        System.out.println(round);
        scanner.close();
    }
//    만나는 라운드가 정해지는것은 라운드가 끝나고 나오는 숫자다. 즉 16 8 9 일 경우
//    첫 번째 라운드 후
//
//김지민: (8 + 1) / 2 = 4.5 → 4
//임한수: (9 + 1) / 2 = 5
//라운드: 1
//두 번째 라운드 후
//
//김지민: (4 + 1) / 2 = 2.5 → 2
//임한수: (5 + 1) / 2 = 3
//라운드: 2
//세 번째 라운드 후
//
//김지민: (2 + 1) / 2 = 1.5 → 1
//임한수: (3 + 1) / 2 = 2
//라운드: 3
//네 번째 라운드 후
//
//김지민: (1 + 1) / 2 = 1
//임한수: (2 + 1) / 2 = 1.5 → 1
//라운드: 4
//    문제해석이 더럽게 어렵다. -> 이거때문에 라운드를 하나 덜 쓰는 불상사가 있었다. 예를 들어 이 문제의 경우 3라운드에 결과가 나오는식으로 생각을 하니 너무어려웠다.-> 예시출력이 안나옴.

}
