package EunJi;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in)); // 한줄씩 통으로 받는거
        int n = Integer.parseInt(br.readLine()); // String으로 받아서 형변환 해줘야함
        int[][] arr = new int[n][2];
        for(int i=0; i<n ; i++){
            StringTokenizer str = new StringTokenizer(br.readLine()); // StringTokenizer는 띄어쓰기 기준으로 한개씩 가져옴
            int a = Integer.parseInt(str.nextToken()); // 역시 String으로 받아서 형변환 해줘야함
            int b = Integer.parseInt(str.nextToken());
            arr[i][0] =a;
            arr[i][1] =b;
        }
        System.out.println(Arrays.deepToString(arr));
    }

}

