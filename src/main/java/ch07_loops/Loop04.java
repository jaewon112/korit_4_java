package ch07_loops;
/*
    for 반복문 ( for loop )
    : 대부분의 경우에는 명확한 횟수가 고정돠ㅣ어 있을 때 사용하는 반복문

    형식:
    for ( 시작값 ; 종료값 ; 증감값) {
        반복실행문
   }
 */

public class Loop4 {
    public static void main(String[] args) {
        // 1부터 100까지의 합을 구하는 for문
//        int sum = 0;
//        for(int i = 0 ; i < 101 ; i++){
//            sum += i;
//        }
//        System.out.println(sum);

        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성하시오.(for문 내에 if가 중첩 가능)
//        int sum = 0;
//        for (int i = 0; i < 101; i++){
//            if (i % 2 == 1){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        int sum3 = 0;
        for (int i = 1; i < 101; i+= 2) {
            sum3 += i;
        }
        System.out.println(sum3);
    }
}
