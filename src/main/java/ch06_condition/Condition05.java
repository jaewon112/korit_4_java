package ch06_condition;
/*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오
    score > 90 ,grde A
    score > 80 ,grde B
    score > 70 ,grde C
    score > 60 ,grde D
    score >= 59 ,grde F

    실행 예
    점수를 입력하세요 >> 68
    당신의점수는 68점이고 , 학점은 d입니다
 */
import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;

        System.out.print("점수를 입력하세요 >>>");
        score = scanner.nextInt();


        if(score > 89){
            grade = "A학점";
        }else if(score > 79){
            grade = "B학점";
        }else if (score > 69) {
            grade = "C학점";
        }else if (score > 59){
            grade = "D학점";
        }else {
            grade = "F학점";
        }
        System.out.println("당신의 점수는 " + score + "이고, " + "학점은 " + grade + "입니다.");
    }
}
