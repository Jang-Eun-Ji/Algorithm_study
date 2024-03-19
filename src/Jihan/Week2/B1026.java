import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 주어진 두 수 배열에 넣기
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(str.nextToken());
            b[i] = Integer.parseInt(str2.nextToken());
        }
        // 두 배열을 정령해 역으로 곱해 더한다.
        Arrays.sort(a);
        Arrays.sort(b);
        int answer =0;
        for(int i=0; i<n; i++){
            answer += a[i]*b[n-i-1];
        }
        System.out.println(answer);
    }
}
