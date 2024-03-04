package EunJi.Week1;

import java.util.HashMap;


public class Beak_4673 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 10001; i++) {
            map.put(i, calculateThatNonsense(i));
        }

        for (int i = 1; i < 10001; i++) {
            if (!map.containsValue(i)){
                System.out.println(i);
            }
        }
    }

    static int calculateThatNonsense(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}

