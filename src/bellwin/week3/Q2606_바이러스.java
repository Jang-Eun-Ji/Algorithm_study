package bellwin.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2606_바이러스 {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        int links = Integer.parseInt(br.readLine());

        visited = new boolean[computers];

        for (int i = 0; i < computers; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < links; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            addEdges(start, end);
        }

        dfs(0);

        System.out.println(answer);
    }

    static void addEdges(int start, int end){
        // 인덱스는 0부터 시작하므로 외부 리스트의 인덱스를 세팅하기 위해 start 변수에서 1씩 빼준다.
        // end 변수는 인덱스 역할이 아닌 value 역할이므로, 그대로 넣어줌
        graph.get(start - 1).add(end);
        graph.get(end - 1).add(start);
    }

    static void dfs(int start){

        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++){
            int target = graph.get(start).get(i) - 1;
            if (!visited[target]) {
                answer++;
                dfs(target);
            }
        }
    }
}
