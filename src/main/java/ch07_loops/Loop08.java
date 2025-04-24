package ch07_loops;
/*
    이상의 별 찍기를 위해서 고려해야할 사항은 이전까지와 좀 달라집니다.
    1. 개행 관련
    2. 별찍기 관련
    3. 공백 관련
 */

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print(">>>>>>>>>>>>>");
        a = scanner.nextInt();

//        for (int i = 0; a-i > 0; i++){
//            System.out.print(" ");
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        j == 0 -> i == 1
//        j == 1 -> i == 2

        // 풀이 #1
        // 개행 관련 1차 for문
//        for (int i = 0; i < a+1; i++){
//            //공백관련 2차a for문
//            for (int j = 5; j >i; j--){
//                System.out.print(" ");
//            }
//            //별찍기 관련 2차b for문
//            for (int k = 0; k<i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 풀이 #2 -> j++ 적용
        for (int i = 0; i < a+1 ; i++){
            for (int j = 0; j<6-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
