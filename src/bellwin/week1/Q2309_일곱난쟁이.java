package bellwin.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 난쟁이 9명의 키를 담는 리스트 생성
        List<Integer> heights = new ArrayList<>();

        // 난쟁이 9명의 키를 리스트에 담기
        for (int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            heights.add(height);
        }

        // 난쟁이 키 리스트를 오름차순으로 정렬
        Collections.sort(heights);

        // 난쟁이 9명 키의 총 합계 산출
        int sum = heights.stream().mapToInt(a -> a).sum();

        // 이중 for문 break를 위한 loop 선언
        loop1:
        // 키가 큰 순서대로 난쟁이 2명을 고른 후 sum에서 키를 차감하는 로직
        for (int i = heights.size() - 1; i >= 0; i--){
            for (int j = i - 1; j >= 0; j--){
                // sum에서 두 난쟁이의 키를 차감했을 때 100과 일치하면 리스트에서 제거 후 이중 for문 탈출
                if (sum - (heights.get(i) + heights.get(j)) == 100) {
                    heights.remove(heights.get(i));
                    heights.remove(heights.get(j));
                    break loop1;
                }
            }
        }
        for (int height : heights){
            System.out.println(height);
        }
    }
}
