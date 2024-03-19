package EunJi.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Beak_1260 {
    static int[][]arr;
    static boolean[] check;
    static int node, line, start_node;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        node = Integer.parseInt(str.nextToken());
        line = Integer.parseInt(str.nextToken());
        start_node = Integer.parseInt(str.nextToken());
        arr = new int[node+1][node+1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        DFS(start_node);
        System.out.println(sb);
    }

    static void DFS(int start){
        check[start] = true;
        sb.append(start + " ");
        for (int i = 0; i <= node; i++) {
            if(arr[start][i] == 1 && !check[i]){
                DFS(i);
            }
        }
    }
}

