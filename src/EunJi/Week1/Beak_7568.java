package EunJi.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Beak_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();

        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            weight.add(sc.nextInt());
            height.add(sc.nextInt());
        }

        for (int i = 0; i < num; i++) {
            int bigNumber = 0;
            for (int j = 0; j < num; j++) {
                if (i != j && weight.get(i) < weight.get(j) && height.get(i) < height.get(j)) {
                    bigNumber++;
                }
            }
            answer[i] = bigNumber + 1;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(answer[i] + " ");
        }
    }

}

