package JongWon.Week1;

import java.util.*;

public class Baek_7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 사람의 수
        int[][] people = new int[N][2]; // 각 사람의 몸무게와 키를 저장할 배열

        // 사람의 몸무게와 키 입력
        for (int i = 0; i < N; i++) {
            people[i][0] = scanner.nextInt(); // 몸무게
            people[i][1] = scanner.nextInt(); // 키
        }

        // 덩치 등수 계산
        for (int i = 0; i < N; i++) {
            int rank = 1; // 덩치 등수는 최소 1등부터 시작
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 자기 자신과는 비교하지 않음
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++; // 자신보다 더 큰 덩치의 사람이 있으면 등수를 1 증가
                }
            }
            System.out.print(rank + " "); // 각 사람의 덩치 등수 출력
        }

        scanner.close();
    }
//    A	(55, 185) 이 형식을 보고 처음에는 배열? Map? 이 떠올랐는데 Map으로 풀기에는 하나에만 저장 할 수 있어서 배열이 낫다고 판단했다.
//     if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
//                    rank++; // 자신보다 더 큰 덩치의 사람이 있으면 등수를 1 증가
//                }
//    이부분을 떠올리는게 너무 어려워서 gpt를 돌려서 했다.
}
