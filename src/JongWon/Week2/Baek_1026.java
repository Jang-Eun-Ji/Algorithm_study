package JongWon.Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Baek_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // A 배열 오름차순으로 정렬
        Arrays.sort(A);

        // B 배열은 그대로 두고, B의 원소에 따른 가중치를 고려하여 A 배열의 원소를 곱함
        Integer[] tempB = B.clone();
        Arrays.sort(tempB);

        int S = 0;
        for(int i = 0; i < N; i++) {
            S += A[i] * tempB[N-1-i]; // A의 가장 작은 값과 B의 가장 큰 값을 곱함
        }

        System.out.println(S);
    }
}

// 수학이 골칫거리라는데 망할놈이 문제도 어려운것도 내놨다 -> 이해가 안됨 역시 입력이랑 출력만 빨리보는게 신상에 이로움
// A의 최소값이랑(바꿀수있음) B의 최대값(위치불변)을 곱해야 최솟값이 나옴
// 여기서 어려운점 가장 큰 값이랑 가장 작은 값이랑 붙여놓을수는 있음 그래서.. 그다음은? 그냥 랜덤하게 아무데나 넣으면 되나
// 좀 찾아봤는데 문제에서 B정렬은 건들지말라고했는데 다들 그냥 정렬해서 씀 ㅋㅋㅋ 이게 뭔... 그래서 혹시 몰라서 GPT돌려봤는데 얘는 원본은 두고 클론을 떠서 하는 경이로운 풀이법을 내놓음
// 콜럼버스급 어메이징한 대답임
// 이거 진짜 짜증나는게 문제읽고 B정렬 어떻게든 안 건들고 풀려는 나같은 사람은 영원히 못푼다 진짜다 영원히...
