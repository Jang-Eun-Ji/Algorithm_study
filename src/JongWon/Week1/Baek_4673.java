package JongWon.Week1;

import java.util.*;

public class Baek_4673 {
    public static void main(String[] args) {
        boolean[] con = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int sum = i;
            int n = i;
            while (n != 0) {
                sum += n % 10; // 각 자리수를 더함
                n /= 10; // 다음 자리수로 이동
            }
            // 생성자가 있는 숫자 체크
            if (sum <= 10000) {
                con[sum] = true;
            }
        }
            // 셀프넘버
            // 이부분의 발상이 떠오르지 않아 chatGpt를 돌렸음.
        for (int i = 1; i <= 10000; i++) {
            if (!con[i]) {
                System.out.println(i);
            }
        }
    }
//    문제 이해 자체는 어렵지 않았는데, 생성자와 셀프넘버를 찾아서 출력하는 부분이 어려웠음. 발상이 안됐음
}
