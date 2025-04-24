package ch07_loops;

import java.util.Scanner;

public class Loop06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print(">>>>>>>");
        a =scanner.nextInt();

        for(int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



            System.out.println();

        // # 1 풀이
//        for (int i = a; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//           }
//        System.out.println();
//        }

        // # 2 풀이

        for (int i = 0 ; i < 5; i++){
            for(int j = 5; j - i > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
