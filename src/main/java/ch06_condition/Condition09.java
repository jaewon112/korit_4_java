package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //논리 연산자 사용
        System.out.print("연도를 입력하세요 >>>");
        int year = scanner.nextInt();
        String leapyear = "";

        if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)){
            leapyear = "윤년입니다.";
        }else{                          //4로 나누어 떻어지지 않거나 // 100으로 나누어지거나
            leapyear = "윤년이 아닙니다.";
        }
        System.out.println(year + "년은" + leapyear);
    }
}
