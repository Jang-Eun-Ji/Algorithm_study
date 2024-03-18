package JongWon.Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCases; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> priorities = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(i); //  인덱스
                priorities.offer(priority); //  중요도
            }

            int printOrder = 0;
            while (!queue.isEmpty()) {
                int currentIndex = queue.poll();
                int currentPriority = priorities.poll();
                boolean isPrintable = true;

                for (int prio : priorities) {
                    if (prio > currentPriority) {
                        isPrintable = false;
                        break;
                    }
                }

                if (isPrintable) {
                    printOrder++;
                    if (currentIndex == M) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    queue.offer(currentIndex);
                    priorities.offer(currentPriority);
                }
            }
        }
        br.close();
    }

}

//FIFO(First In, First Out; 선입선출)
//        offer(): 큐의 끝에 새로운 요소를 추가.
//        poll(): 큐의 앞부분에서 요소를 제거하고 반환합니다. null을 반환
//        Peek/Front: 큐의 맨 앞에 있는 요소를 조회
//        IsEmpty: 큐가 비어 있는지 확인합니다.
//        add(): 큐에 요소를 추가
//        remove(): 큐의 앞부분에서 요소를 제거 큐가 비어있으면 예외
//        element(): 큐의 앞부분에 있는 요소를 반환하지만 제거하지 않음

//        중요도가 높은 순으로 인쇄 됨
//        근데 중요도 같으면 뭐 어쩌란거? -> 일단 같은것들을 맨뒤로 보내고 가장 큰 것 부터 찾는다. 그 후 순서대로 찾는다.
//        입력 예시 맨처음에 3이 왜있는거-> 테스트 케이스 개수임







// 수업시간에 했던걸 계속 보고 갖다넣어보고 개념 공부를 다시했는데 진짜 솔직히 잘모르겠다.

// 그냥 예제(나중에 볼 거임)
//  Queue<Integer> queue = new LinkedList<>();
//// 요소 추가
//    queue.offer(1);
//    queue.offer(2);
//    queue.offer(3);
//    System.out.println("Queue after offers: " + queue);
//
//// 요소 확인 (제거하지 않음)
//    System.out.println("Element at front without removal: " + queue.peek());
//
//        // 요소 제거
//        System.out.println("Removed element: " + queue.poll());
//        System.out.println("Queue after poll: " + queue);
//
//// 큐가 비어있는지 확인
//    if(!queue.isEmpty()) {
//        System.out.println("Queue is not empty.");
//    }
//
//            // 큐에 남아있는 요소 제거
//            while(queue.peek() != null) {
//        System.out.println("Removing: " + queue.poll());
//        }
//
//        // 최종적으로 큐가 비었는지 확인
//        System.out.println("Is the queue empty? " + queue.isEmpty());
//        }