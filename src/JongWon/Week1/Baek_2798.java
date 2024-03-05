package JongWon.Week1;
import java.util.*;

public class Baek_2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int[] cards = new int[N]; 
        int result = 0;
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt(); 
        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum > M) continue; 
                    if (M - sum < M - result) {
                        result = sum;   
                    }
                } 
            }
        }   System.out.println(result);
    }   
}