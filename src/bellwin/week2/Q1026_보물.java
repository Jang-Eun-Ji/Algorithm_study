package bellwin.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1026_보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int sum = 0;

        // A 리스트는 오름차순 정렬
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            aList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(aList);

        // B 리스트는 내림차순 정렬
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            bList.add(Integer.parseInt(st.nextToken()));
        }
        bList.sort(Collections.reverseOrder());

        // 같은 인덱스끼리 곱해서 더해주면, A의 최솟값과 B의 최댓값을 곱한 것의 합(S)은 최소가 된다.
        for (int i = 0; i < N; i++){
            sum += aList.get(i) * bList.get(i);
        }

        System.out.println(sum);
    }
}
