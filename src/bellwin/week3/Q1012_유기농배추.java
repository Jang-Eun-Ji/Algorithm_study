package bellwin.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012_유기농배추 {

    static int N, M, K;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수

            graph = new int[M][N]; // 배추밭 가로, 세로 크기 설정

            // 배추가 심어져 있는 곳에 1세팅
            for (int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            int result = 0; // 배추흰지렁이 마리 수

            // 2중 for문으로 2차원 배열을 (0,0)부터 모두 탐색
            for (int m = 0; m < M; m++){
                for (int n = 0; n < N; n++){
                    if (dfs(m, n)){
                        result += 1;
                    }
                }
            }
            System.out.println(result);
        }
    }

    static boolean dfs(int x, int y){

        // x, y가 배추밭의 범위를 벗어나면 false 리턴
        if (x < 0 || x >= M || y < 0 || y >= N){
            return false;
        }

        if (graph[x][y] == 1){
            // 1인 배추밭을 방문하면 0으로 바꿔주기 때문에 visited 사용 필요 없음.
            graph[x][y] = 0;

            // 배추밭 상, 하, 좌, 우 dfs 돌리기
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
