package ch07_loops;
/*
         while (조건식1) {
                반복 실행문1a
                while(조건식2) {
                    반복실행문2
             }
             반복실행문1b
          }

 */
public class Loop02 {
    public static void main(String[] args) {
//        // 1일차 1교시입니다 ~ 1일차 3교시입니다 / 5일차 3교시입니다.
//        int day = 1;
//        while ( day < 6 ) {
//            int lesson = 1;                 // 반복문 내에 변수를 선언하고 초기화했습니다.
//            while (lesson < 4) {
//                System.out.println(day + "일차" + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++;
//
//        }

       int a = 2 ;
        while (a < 10 ) {
            int b = 1;
            while (b < 10) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }
        }

    }
