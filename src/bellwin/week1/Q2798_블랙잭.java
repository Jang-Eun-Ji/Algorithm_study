package bellwin.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2798_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> cards = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cards.add(sc.nextInt());
        }
        int max = 0;
        for (int i = 0; i < cards.size() - 2; i++){
            if (cards.get(i) > M){
                continue;
            }
            for (int j = i + 1; j < cards.size() - 1; j++){
                if (cards.get(j) > M){
                    continue;
                }
                for (int k = j + 1; k < cards.size(); k++){
                    if (cards.get(k) > M){
                        continue;
                    }
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum == M){
                        max = sum;
                        System.out.println(max);
                        return;
                    }
                    if (sum < M && sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
