package ch08_methods;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Method03 {

    public static void main(String[] args) {
        /*
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>> 3
            1. 과목의 점수를 입력하세요 >>>100
            2. 과목의 점수를 입력하세요 >>>90
            3. 과목의 점수를 입력하세요 >>>80
            과목의 총 합 : 285.0 , 평균 : 95.0
         */
      calculateAvgScore();
    }
    public  static  void  calculateAvgScore() {
        Scanner scanner = new Scanner(System.in);
            double sum = 0;
            double avgScore = 0;
            int numOfSub = 0;
            int a = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSub = scanner.nextInt();
        for(int i = 0; i< numOfSub; i++){
            System.out.println((i+1)+ "과목의 점수를 입력하세요 >>>");
            sum += scanner.nextDouble();
        }
        avgScore = sum / numOfSub;
        System.out.println("총 합은" + sum + "점이며 , 평균은" + avgScore + "점 입니다");
    }
}
