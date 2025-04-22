package ch03_operator;
/*
     camel case -> Java 변수 표기법
     snake case -> Java 에서는 쓸 일이 잘 없음
     Pascal case -> 첫 문자가 대문자이고 나머지 소문자로 가다가
                    두 번째 단어의 첫 번째 문자는 또 대문자로 작성
                    ex) 한 단어 짜리 : Operator01
                    ex) 복수 단어 : OperatorTest

 */
public class Operator01 {
    public static void main(String[] args) {

        //변수 선언 및 초기화
//        int i = 10;

        //여기서 자료형 , 변수형 , 데이터에 대해서는 학습했습니다
        // '=' 얘를 배울 겁니다.
        /*
            대입 연산자 = : = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입한다는 의미'로,
            변수와 데이터가 동일하다는 수학적인 의미가 아닙니다.
         */

//        int i2 = 20;
//        i2 = i2 + 30 ; // 왼쪽과 오른쪽이 같다고 표시 할 때는 == 을 사용\
//        System.out.println(i2);
        System.out.println("========================================================================");
        // 일반 연산자
        /*
                +: 더하기
                -: 빼기
                *: 곱하기
                /: 나누기
                %: 나머지 연산자  - > 두 수를 나눴을 때 나머지 값을 반환합니다.
                                   소수점 이하를 버리는 정수 나눗셈에서만 정확하게 나머지를 구하는 데 사용됩니다.
         */
//        int a = 5;
//        int b = 2;
//        double result = (double) a / b ;
//        System.out.println(result);
//        System.out.println(a%b);

        System.out.println("========================================================================");
        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;                     // += 는 num1 = num1 + 2;
        System.out.println(num1);
        num1 -= 1;                     // -= 는 num1 = num1 - 1;
        System.out.println(num1);
        num1 *= 10;                    // *= 는 num1 = num1 * 10;
        System.out.println(num1);
        num1 /= 5;                     // /= 는 num1 = num1 / 5;
        System.out.println(num1);


//        int j  = 10;
//        System.out.println(j);
//        System.out.println(j++);    //변수명 ++ : 코드를 실행시킨 후에 j에 1을 더함
//        System.out.println(j);      // 그래서 다시 j 를 출력 시켰을 때 여기가 +1
//        System.out.println(++j);    // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함 결과값 12
//        System.out.println(j);      // 결과값 12
//        System.out.println(j--);    // 변수명 -- : 코드를 실행시킨 후에 j에 1을 뺌
//        System.out.println(j);      // 결과값 11
//        System.out.println(--j);    // --변수명 : 코드를 실행시키기 전에 j에 1을 뺌  결과값 10

        int age = 10;
        System.out.println("제 나이는 " + age + "입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");



    }

}

