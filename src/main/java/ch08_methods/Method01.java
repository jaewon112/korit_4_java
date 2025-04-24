package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method 를 정의하는 영역

    //1. [x|x] [입력값/출력값]
    public static void call1(){
        System.out.println("[x|x]");
    }
//2 , [o | x]
    public static void call2(String strExample) {// ()괄호 안에 있는 것을 매개변수라 함{

        System.out.println("[o|x]");
        System.out.println("오늘의 다짐 : " + strExample);

    }
// 3. [x|o]
    public static String call3 () {
            System.out.println("[x|o]");
            String result = "";             // 지역 변수 - 메서드 내에 정의된 변수
            for(int i = 0; i< 3; i++){
                for (int j=0; j<i+1; j++){
                    result += "*";
                }
                result +="\n"; // \n - 개행하라는 의미 \t - 공백 두번
            }
            return result;
    }
    // 4.[o|o]
    public static  String call4(int year , int month , int date , String day){

        System.out.println("[o|o]");
        return  year + "년" + month + "월" + date + "일" + day + "요일입니다";
    }
// 자기 소개를 하는 메세드르 하나 정의할 예정입니다
    public static String introduce(String name , int age){
        return "이름 : " + name + " 나이 : " + age + "\n내년에는" + (age+1) + "살이됩니다";
    }


    public static void main(String[] args) {
        // method 를 실행(호출)하는 영역


        // 1.
        call1();

        // 2.
        call2("메서드 이해하기"); // 호출 단계에서 () 내를 채우는 것을 argument
//        return = "대입 불가";


        // 3.
        System.out.println(call3());        // call3() 는 출력하라는 명령문이 메서드 내에 정의되어있지 않음
                                            // 이상의 이유로 sout이 main단계에서 요구됨.


        // 4.
        System.out.println(call4(2025,4,24,"목"));
        String name ;
        int age;
        Scanner scanner = new Scanner(System.in);
        name =scanner.nextLine();
        System.out.println("이름");
        age = scanner.nextInt();
        System.out.println("나이");

        String introduction = introduce(name,age);
        System.out.println(introduction);

        /*
            함수형 프로그래밍 (Funtional Programming) :
                메서드 1의 return 값이 메서드2의 argument 가 되고,
                메서드 2의 return 값이 메서드3의 argument 가 되는 방식으로

                첫 번째 메서드로 부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어진느 방식을 의미함.

                이상의 예시에서는 .nextLine()의 결과값과 .nextInt()의 결과값이 .Introduce()의 argument1 , argument2로 사용되었습니다.
         */


    }
}
