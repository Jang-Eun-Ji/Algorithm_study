package bellwin.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 전체 사람의 수
        int N = Integer.parseInt(st.nextToken());

        // 몸무게, 키 정보를 가진 크기가 2인 배열의 리스트
        List<int[]> infos = new ArrayList<>();

        // 각 사람의 등수를 담는 리스트
        List<Integer> ranks = new ArrayList<>();

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()); // 몸무게
            int height = Integer.parseInt(st.nextToken()); // 키
            int[] info = new int[]{weight, height}; // 크기가 2인 배열에 몸무게, 키 정보를 담는다.
            infos.add(info); // 리스트에 추가하기
        }

        for (int i = 0; i < infos.size(); i++){
            int rank = 1; // 모든 사람의 등수는 1등으로 시작
            for (int j = 0; j < infos.size(); j++){
                if (i == j){ // 자기 자신과 비교할 필요 없으므로 스킵
                    continue;
                }
                // 몸무게와 키가 모두 작으면 등수가 낮아짐. 숫자가 클수록 낮음
                if (infos.get(i)[0] < infos.get(j)[0] && infos.get(i)[1] < infos.get(j)[1]){
                    rank++;
                }
            }
            ranks.add(rank);
        }
        for (int rank : ranks){
            System.out.print(rank + " ");
        }
    }
}
