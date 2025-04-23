package ch07_loops;
/*
    for(int i = 0; i < 10 ; i++) {
        반복실행문 1-ㅁ
        for(int j = 0; j<10; j++) {
            반복실행문2
     }
    ( 반복실행문1-b)
    for(int k = 0 ; k < 10; k++) {
        반복 실행문3
     }
     (반복실행문 1-c)
  }
  *
  **
  ***
  ****
  *****

 */

public class Loop06 {
    public static void main(String[] args) {
        for ( int i = 0 ; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.println("*");          //별이 한번에 여러번 찍힐수 있기 때문에 print로 작성
            }
            System.out.println();                 // 개행이 일어나는 1차 for 문
        }
    }
}
