package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260_DFS와BFS {

    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 탐색 시작할 정점의 번호

        visited = new boolean[N]; // 인덱스 0부터 시작

        for (int i = 0; i < N; i++){
            graph.add(new ArrayList<>()); // 내부 리스트 객체 생성
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            addEdge(start, end);
        }

        // 이중 리스트 내부의 각 리스트의 요소를 오름차순으로 정렬
        for (List<Integer> index : graph) {
            Collections.sort(index);
        }

        dfs(V - 1);
        // dfs에서 사용한 visited 배열 false로 초기화, bfs에서 써야하므로
        Arrays.fill(visited, false);
        System.out.println();
        bfs(V - 1);
    }

    static void addEdge(int start, int end){
        graph.get(start - 1).add(end);
        graph.get(end - 1).add(start);
    }

    static void dfs(int start){
        visited[start] = true;
        System.out.print(start + 1 + " ");
        for (int i = 0; i < graph.get(start).size(); i++){
            int target = graph.get(start).get(i) - 1;
            if (!visited[target]){
                dfs(target);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(start);
        visited[start] = true;
        while(!Q.isEmpty()){
            int node = Q.poll();
            System.out.print(node + 1 + " ");
            for (int i = 0; i < graph.get(node).size(); i++){
                int target = graph.get(node).get(i) - 1;
                if (!visited[target]){
                    Q.offer(target);
                    visited[target] = true;
                }
            }
        }
    }
}
