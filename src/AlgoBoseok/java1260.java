package Algorithm_study_hagogaza.src.AlgoBoseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class java1260 {

    static List<List<Integer>> graph;
    static boolean[] visited; // 방문 표시
    static StringBuilder sb = new StringBuilder(); // 출력값담기
    static int N, M, V; // 입력값 담을 곳

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 1줄 읽기
        StringTokenizer stk = new StringTokenizer(br.readLine()); // 1칸씩 잘라서 읽기 준비

//         한칸씩 읽기
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        V = Integer.parseInt(stk.nextToken());

//        빈 graph 만들기
//        결과값: [ [],[],[],[],[] ]
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

//        각 노드별 연결된 값 넣기
//        결과 값 : [[], [2, 3], [5, 1], [4, 1], [5, 3], [4, 2]]
        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
//        결과 값 정렬
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N + 1]; // 노드 만큼 만들기
        dfs(V);

        sb.append("\n"); // 한 줄 띄기
        visited = new boolean[N + 1]; // 방문값 초기화
        bfs(V);

        System.out.println(sb);

    }


    //    깊게 들어가기
    private static void dfs(int v) {
//        출발 노드 방문처리, 다음에 방문하지 않기 위해서
        visited[v] = true;
//        현재 노드 출력값에 추가
        sb.append(v + " ");
//        현재 노드랑 연결된 노드 찾기
        for (int i : graph.get(v)) {
//            현재 노드와 연결된 노드가 방문하지 않았으면 방문 고
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    //    넓게 들어가기
    private static void bfs(int v) {
//        Q 선언
        Queue<Integer> Queue = new LinkedList<>();
//        시작노드 넣기
        Queue.add(V);
//        시작노드 방문처리
        visited[V] = true;
//        Q가 비어있지 않는동안. 즉 다음 노드가 없을때까지
        while (!Queue.isEmpty()) {
//            다음 연결된 노드 뽑기
            int dx = Queue.poll();
//            출력값에 넣기
            sb.append(dx + " ");
//            연결된 노드 하나씪 빼서
            for (int i : graph.get(dx)) {
//                방문 안했으면
                if (!visited[i]) {
//                    방문처리하고
                    visited[i] = true;
//                    다시 큐에 넣어
                    Queue.add(i);
                }
            }
        }
    }
}
