package ch06_condition;
/*
    Condition07 파일을 확인하시면
    점수를 입력 받아서 등급을 산출했습니다.

    이를 응용하여 중첩 if 문 + switch 문 형태로 프로그램을 작성합니다.

    지시 사항
    사용자에게 score 를 입력 받아서 다음과 같은 조건을 만족시키도록 작성하시오.
    score 가 0미만이거나 100 초과라면 grade = x

    chagedScore = 9~10 , grade = A
    chagedScore = 8 , grade = B
    chagedScore = 7 , grade = C
    chagedScore = 6 , grade = D
    chagedScore = 5~1 이면  , grade = F

    실행 예
    점수를 입력하세요 >>>100
    점수는 100점이고 , 학점은 A학점입니다.
    changedScore = score / 10

 */

import java.util.Scanner;

public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int score;
        int changedScore;
        String grade;
        System.out.print("점수를 입력하세요>>");
        score = scanner.nextInt();
        changedScore = score / 10;


        if(score < 0 || score > 100) {
            grade = "x";
        }else {                 // 0<= score <= 100의 범위를  충족하면 이하의 실행문이 실행됨
            switch (changedScore) {
                case 10:
                case 9 :
                    grade = "A";
                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7:
                    grade ="C" ;
                    break;
                case 6 :
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }

        }



//        switch (changedScore) {
//            case 10:
//            case 9 :
//                grade = "A";
//                break;
//            case 8 :
//                grade = "B";
//                break;
//            case 7 :
//                grade = "C";
//                break;
//            case 6 :
//                grade = "D";
//                break;
//            default:
//                grade = "F";
//                break;
//            }
        System.out.println("점수는" + score + "점이고 , 학점은 " + changedScore + "학점입니다.");

        }

    }

