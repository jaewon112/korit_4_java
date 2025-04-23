package ch06_condition;
/*
    switch 문
    형식 :
    switch(변수명)
         case 조건1:
            실행문1
            break;
         case 조건2:
            실행문2
            break;
         case 조건3:
            실행문3
            break;
         case 조건4:
            실행문4
            break;
        default:
            실행문5
 */

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selectedNum;
        String selectedchar;
        System.out.println("[메뉴 선택하기]");
        System.out.println("a. 1번 메뉴");
        System.out.println("b. 2번 메뉴");
        System.out.println("c. 3번 메뉴");
        System.out.println("d. 4번 메뉴");
        System.out.println("e. 5번 메뉴");
        System.out.print("메뉴를 선택하세요 >>>");
//        selectedNum = scanner.nextInt()
        selectedchar = scanner.next();

//        if(selectedNum <1 || selectedNum > 5){
//            System.out.println("불가능한 메뉴 번호입니다");
//        }else {
//            //.......
//        }

        //방금까지 배운 조건문이긴 하지만 보기에는 편하지 않습니다.
        // 이상의 코드를 switch문으로 작성한다고 하면

        switch (selectedchar) {
            case "a" :
             System.out.println("메뉴 1을 선택하셨습니다.");
            break;                                       //break의 의미 : 조건문을 탈출한다는 의미
            case "b" :
            System.out.println("메뉴 2을 선택하셨습니다.");
            break;
            case "c" :
            System.out.println("메뉴 3을 선택하셨습니다.");
            break;
            case "d" :
            System.out.println("메뉴 4을 선택하셨습니다.");
            break;
            case "e" :
            System.out.println("메뉴 5을 선택하셨습니다.");
            break;
            default :                                   // defult : selectedNum(변수명)이 case에 속하지 않을 때 실행됨
                System.out.println("잘못 선택하셨습니다");

        }
    }
}
