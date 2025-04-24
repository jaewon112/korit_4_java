package ch07_loops;

import java.util.Formattable;
import java.util.Scanner;

/*
    몇 줄의 별을 찍겠습니까? >>>>>>>3
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("몇 줄의 별을 찍겠습니까? >>>>>>>");
        a = scanner.nextInt();
//
//        for (int i = a; i>0; i--){
//            for (int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < a; i++){
            for (int j = a; j - i >0; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
        // 오늘 복습시간에 md파일 정리할 때 # 1 풀이법으로도 작성해보세요.
    }
}
