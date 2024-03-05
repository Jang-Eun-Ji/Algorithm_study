import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] arr = new int[n];
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str2.nextToken());
        }
        int max=0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp >= max && temp <= m){
                        max = temp;
                    }
                }
            }
        }
        System.out.println(n);
        System.out.println(m);
        System.out.println(Arrays.toString(arr));
        System.out.println(max);

    }
}
