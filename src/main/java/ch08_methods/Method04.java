package ch08_methods;
/*
    bmi 계산기 method를 정의하고 실행시킬겁니다.
    메서드명 : calculateBmi()
    return type : void
    매개변수 유무 : 없음

 */

import java.util.Scanner;

public class Method04 {
    //여기에 정의할겁니다.
    public static void calculateBmi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요 : ");
        double cm = scanner.nextDouble()/100;
        System.out.print("몸무게(kg)를 입력하세요 : ");
        double kg = scanner.nextDouble();
        double bmi = kg / (cm*cm);
        String grade = "";
        if(bmi < 18.5){
            grade = "저체중";
        }else if(bmi < 23) {
            grade = "정상";
        }else if (bmi < 25) {
            grade = "과체중";
        }else {
            grade = "비만";
        }
        System.out.println("당신의 BMI 지수는 " + bmi + "이고 ," +  grade + "입니다");
    }
    public static void main(String[] args) {
        calculateBmi();
        /*
            실행 예
            키(cm)를 입력하세요 >>> 172.5
            몸무게(kg)을 입력하세요 >>> 68.7
            당신의 BMI 지수는 23.08이고 , 과체중


         */
    }

}
