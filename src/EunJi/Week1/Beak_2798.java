package EunJi.Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beak_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> card = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            card.add(sc.nextInt());
        }
        int answer = 0;

        for (int i = 0; i < card.size() - 2; i++) {
            for (int j = i + 1; j < card.size() - 1; j++) {
                for (int k = j + 1; k < card.size(); k++) {
                    int now = card.get(i) + card.get(j) + card.get(k);
                    if ((m - answer) > (m - now) && now <= m) {
                        answer = now;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}

