import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        int l = Integer.parseInt(str.nextToken());
        int round = 0;
        while (k!=l){
            k = k%2 + k/2;
            l = l%2 + l/2;
            round++;
        }
        System.out.println(round);
    }
}
