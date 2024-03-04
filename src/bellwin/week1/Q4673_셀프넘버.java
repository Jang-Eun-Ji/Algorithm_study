package bellwin.week1;

import java.util.ArrayList;
import java.util.List;

public class Q4673_셀프넘버 {
    public static void main(String[] args) {

        // 셀프 넘버가 아닌 숫자 (이후 '비셀프넘버'로 부름) 리스트 선언
        List<Integer> notSelfNumbers = new ArrayList<>();

        // 1부터 시작
        int N = 1;
        while (N < 10000){
            // 2자리 이상인 숫자는 문자열로 변환 후 분리시켜야 함
            if (N >= 10){
                // 초기 비셀프넘버에 N이 더해진다. 이후 각 자릿수별 숫자 더해줌
                int notSelfNumber = N;

                // 두자리 이상 숫자를 문자열로 변환 후 문자열 배열로 분리
                String[] sp = String.valueOf(N).split("");
                for (String str : sp){
                    // N을 분리했을 때 나오는 숫자를 N에 더하면 비셀프넘버이다.
                    notSelfNumber += Integer.parseInt(str);
                }
                // 비셀프넘버를 비셀프넘버 리스트에 추가한다.
                notSelfNumbers.add(notSelfNumber);
            } else {
                // 한 자리수인 비셀프넘버를 비셀프넘버리스트에 추가
                notSelfNumbers.add(N + N);
            }
            N++;
        }
        // 1부터 10000 이하의 숫자 중 셀프 넘버 찾기
        for (int i = 1; i < 10001; i++){
            // i가 비셀프넘버 리스트에 없으면 셀프 넘버
            if (!notSelfNumbers.contains(i)){
                System.out.println(i);
            }
        }
    }
}
