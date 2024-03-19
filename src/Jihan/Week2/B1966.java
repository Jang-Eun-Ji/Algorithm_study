import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(str.nextToken());
            int M = Integer.parseInt(str.nextToken());
            StringTokenizer str2 = new StringTokenizer(br.readLine());
            Queue<int[]> q = new LinkedList<>();
            for(int j=0; j<N; j++){
                q.add(new int[]{j,Integer.parseInt(str2.nextToken())});
            }
            int count =0;

        }

    }
}
