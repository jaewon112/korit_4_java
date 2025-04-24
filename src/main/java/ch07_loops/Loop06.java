package ch07_loops;
/*
    for(int i = 0; i < 10 ; i++) {
        반복실행문 1-a
        for(int j = 0; j<10; j++) {
            반복실행문2
     }
    ( 반복실행문1-b)
    for(int k = 0 ; k < 10; k++) {
        반복 실행문3
     }
     (반복실행문 1-c)
  }
  *
  **
  ***
  ****
  *****

 */

import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {
//        for ( int i = 0 ; i < 5; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");          //별이 한번에 여러번 찍힐수 있기 때문에 print로 작성
//            }
//            System.out.println();                 // 개행이 일어나는 1차 for 문
//        }
//        Scanner scanner = new Scanner(System.in);
//        int a;
//        System.out.print("몇 줄의 별을 생성할것인가>>>");
//        a = scanner.nextInt();
//
//
//        for(int i=a; i>0; i--){
//           for(int j = 0; j<i; j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별찍기를 실행하시겠습니까?");
        int row = scanner.nextInt();

        //이상의 row변수를 활용하여
        // 실행 예
        // 몇줄의 별찍기를 실행하시겟습니까?
        for (int i = 0; i < row+1; i++){            // 1차 for 문은 개행의 숫자와 관련있음
            for (int j = 0; j < i; j++){            // 2차 for 문의 경우에는 별이 찍히는 횟수와 관련있음
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
