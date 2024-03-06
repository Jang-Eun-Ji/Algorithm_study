package EunJi.Week0;

import java.util.Scanner;

public class Beak_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer = "666";
        int count = 0;

        if(num < 20 && num != 1){ // 변수가 1개 !! 여기서 모두 6으로 중복인 값을 제거하기
            if(num < 7){
                num = num - 1;
                System.out.println(num + answer);
            }else if(num < 17){
                num = num - 10;
                System.out.println(answer + num);
            }else {
                num = num - 11;
                System.out.println(num + answer);
            }
        }else if(num < 301){ // 변수가 2개
//            if()

        } else if (num < 4001) { // 변수가 3개


        }else {

        }
    }


    // 1 - x666: 666 2- 1666, 3 -2666, 4 - 3666, 5- 4666, 6- 5666,
    //     666x: 7 - 6660, 8 - 6661, 9 - 6662, 10- 6663, 11 - 6664, 12 - 6665, 13 - 6666, 14 - 6667, 15 - 6668, 16 - 6669
    //     x666: 17 - 7666, 18 - 8666, 19 - 9666
    // --- 19까지의 수는 4자리수
    // 20 - 10666, 21 - 11666, 12666,... 27- 16666,
    //      28 - 16660
    //      38 - 17666, 39 - 18666, 40 - 19666
    //    xx666: 21~
//
//    xx666,x666x,666xx
    // --- 90*2 + 100 + 20 = 300 까지의 수는 5자리수
    // 301 - 100666
    // --- 900*3 + 1000 + 300 = 4000 까지의 수는 6자리수
    /// 4001 - 1000666
    // --- 9000*4 + 10000 + 4000 = 50000 7자리 수
    //
//    static int counter(int num, String answer){
//        whi
//    }
}


