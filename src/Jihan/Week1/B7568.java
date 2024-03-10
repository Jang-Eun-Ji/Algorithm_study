import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n ; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
        }
        int[] answer = new int[n];
        for(int i=0; i<n ; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    count++;
                }
            }
            answer[i] = count;
        }
        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}
