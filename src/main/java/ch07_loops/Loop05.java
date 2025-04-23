package ch07_loops;

public class Loop05 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 5일차 3교시 입니다
        for (int i = 0; i<6 ; i++){
            for(int j = 1; j<4; j++){
                System.out.println(i + "일차" + j + "교시입니다.");
            }
        }
        //이상의 코드를 응용하여 구구단을 출력하세요.
        for (int i =2; i < 10 ; i++) {
            for (int j = 1; j < 10;j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
        // 반복 100번 하는방법

        for ( int i =1; i < 101; i++){
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("=========================================================");

        //반복 10번 하는방법
        for (int i2 = 1; i2 <101; i2 += 10){
            System.out.println(i2 + " " + (i2 + 1) + " " + (i2 + 2) + " " +(i2 + 3) + " " + (i2 +4) + " " + (i2 + 5) + " " +(i2 + 6) + " " +(i2 + 7) + " " + (i2 + 8) + " " +(i2 + 9));
            if(i2 % 10 == 0){
                System.out.println();
            }
        }



    }
}
