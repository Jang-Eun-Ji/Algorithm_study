package HeeJune.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beak_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
    }

    public static boolean counts(String a) {
        List<Character> divide = new ArrayList<>();
        if (a.length() == 1) {
            return true;
        }

        if (a.length() > 1) {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.charAt(i) != a.charAt(i + 1)) {
                    divide.add(a.charAt(i));
                }
            }
            if (a.charAt(a.length() - 2) != a.charAt(a.length() - 1)) {
                divide.add(a.charAt(a.length() - 1));
            }

            Set<Character> checkDoubles = new HashSet<>(divide);
            if (checkDoubles.size() == divide.size()) {
                return true;
            }
            return false;
        }
        return false;
    }
}

