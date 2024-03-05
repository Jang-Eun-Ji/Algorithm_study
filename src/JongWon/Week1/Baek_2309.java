package JongWon.Week1;

import java.util.*;
public class Baek_2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[9];
        int total = 0;

        // 난쟁이 키 입력 받기
        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
            total += heights[i];
        }

        Arrays.sort(heights); // 키 오름차순 정렬

        // 두 명의 가짜 난쟁이 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - heights[i] - heights[j] == 100) {
                    // 일곱 난쟁이의 키 출력
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) { // 가짜 난쟁이 제외
                            continue;
                        }
                        System.out.println(heights[k]);
                    }
                    return; // 전체 프로그램 종료 필요 없이 main 메소드 정상 종료
                }
            }
        }
//        처음에는 난쟁이들의 각각의 키를 입력받은것들을 조합하여 100을 만들려고 시도 했었는데 코드 자체를 짜는게 너무 어려워서 찾아보니
//        모두 더하고 거기서 2명씩 빼는 방식으로 구하길래 시도해보았다.
    }
}
