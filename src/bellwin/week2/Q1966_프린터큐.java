package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1966_프린터큐 {

    static class Node {
        private int index;
        private int rank;

        public Node(int index, int rank){
            this.index = index;
            this.rank = rank;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++){

            // index와 rank(중요도)를 가진 node를 담을 큐 생성
            Queue<Node> Q = new LinkedList<>();
            int index = 0;
            int N = 0; // 문서의 개수
            int M = 0; // 타겟 문서가 현재 Queue에서 놓인 위치
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());

            // 주어진 중요도(rank)를 담을 리스트를 생성
            // 이후 max값 지정할 때 사용함
            List<Integer> rankList = new ArrayList<>();

            while (st.hasMoreTokens()){
                int rank = Integer.parseInt(st.nextToken());
                rankList.add(rank);

                // 노드 객체는 index와 rank(중요도)를 가지고 있고 큐에 순서대로 삽입
                Node node = new Node(index++, rank);
                Q.offer(node);
            }

            // 중요도 리스트를 내림차순으로 정렬
            rankList.sort(Collections.reverseOrder());

            index = 0;
            int answer = 0;
            int max = rankList.get(index);
            while (!Q.isEmpty()){
                // Node의 index가 M(타겟 문서)이고, rank가 max와 동일하다면 타겟 문서가 몇 번째로 인쇄되는 지 알 수 있음
                if (Q.peek().index == M && Q.peek().rank == max){
                    answer++;
                    System.out.println(answer);
                    break;
                }

                // Node의 rank(중요도)가 max와 같지 않으면 poll해서 큐의 맨 뒤 순서로 add한다.
                if (Q.peek().rank != max){
                    Q.offer(Q.poll());
                    continue;
                }

                // Node의 rank(중요도가) max와 같고, index가 M이 아니면 큐에서 제외시키고,
                // 중요도 리스트에서 그 다음으로 큰 rank를 max로 지정
                Q.poll();
                max = rankList.get(++index);
                answer++;
            }
        }
    }
}
