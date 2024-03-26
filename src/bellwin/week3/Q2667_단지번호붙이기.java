package bellwin.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2667_단지번호붙이기 {

    static int N;
    static int[][] graph;
    static int count;
    static List<Integer> houses = new ArrayList<>(); //
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        for (int i = 0; i < graph.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            for (char c : st.nextToken().toCharArray()){
                // char형태의 변수를 '0'으로 빼주면 정수가 됨
                graph[i][j++] = c - '0';
            }
        }

        int result = 0; // 총 단지 수

        // 2중 for문으로 2차원 배열을 (0,0)부터 모두 탐색
        for (int i = 0; i < graph.length; i++){
            for (int j = 0; j < graph.length; j++){
                if (dfs(i, j)){
                    result += 1; // dfs가 정상적으로 순회하면 단지 수 1 증가
                    houses.add(count); // dfs 돌면서 카운트 한 집의 개수를 리스트에 넣음
                    count = 0; // 카운트 초기화
                }
            }
        }

        System.out.println(result);
        Collections.sort(houses); // 오름차순 정렬
        for (int house : houses){
            System.out.println(house);
        }
    }

    static boolean dfs(int x, int y){

        // 범위 이탈 시 false 리턴
        if (x < 0 || x >= N || y < 0 || y >= N){
            return false;
        }

        // 집이 있는 곳(1)을 방문하면 0으로 바꿔주기 때문에 visited 사용 필요 없음.
        if (graph[x][y] == 1){
            graph[x][y] = 0;
            count++; // 특정 단지의 집 개수 카운트

            // 지도 상, 하, 좌, 우 dfs 돌리기
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
