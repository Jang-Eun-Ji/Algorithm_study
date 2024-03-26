package HeeJune.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beak_2606 {
    static boolean[] visited;
    static List<List<Integer>> connections;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        //초기화
        visited = new boolean[node];
        connections= new ArrayList<>();
        for (int i = 0; i < node; i++) {
            connections.add(new ArrayList<>());
        }
        //연결된 페어 넣기
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            addPairs(a,b);
        }
        System.out.println(bfsCount(0));
    }
    public static void addPairs(int a, int b){
        connections.get(a).add(b);
        connections.get(b).add(a);
    }

    public static int bfsCount(int start){
        int count=0;
        Queue<Integer> myQue= new LinkedList<>();
        visited[start]= true;
        myQue.add(start);
        while(!myQue.isEmpty()){
            int next = myQue.poll();
            for(int nextMove: connections.get(next)){
                if(visited[nextMove]==false){
                    visited[nextMove]=true;
                    myQue.add(nextMove);
                    count++;
                }
            }
        }
        return count;
    }
}
