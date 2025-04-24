package ch09_classes;

import java.util.Scanner;

public class ClassA_Main {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        /*
         이상에서 볼 수 있듯이

         여태까지 Scanner 클래스를 import 한다고 했지만
         Scanner 클래스의 인스턴스를 생성하고 있었습니다.
        */

        //객체생성방법
        // 클래스명 객체명 = new 클래스명();

        // 객체의 속성 접근 방법
        // 객체명.속성명
         classA1.num = 100;
         classA1.name = "김일";

         ClassA classA2 = new ClassA();

         classA2.num = 200;
         classA2.name = "김이";
        System.out.println(classA2.name + "의 번호는" + classA2.num+ "이다.");


        //메서드 호출 방법
        //객체명.메서드명()

        classA1.callName();
        classA2.callName();
        // 이상의 두 method 호출 결과는
        // 서로 '다르다' 고 말해야합니다

        /*
            Scanner 의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3를 생성한 다음,
            다음과 같이 실행될 수 있도롥 작성하시오

            이름을 입력하세요 >>>김삼
            번호를 입력하세요 >>>20250003
            점수를 입력하세요 >>> 4.5             ->field정의 사용

            그리고 call1() 유형으로
            displayProfile() 을 ClassA에 정의하신 후에
            classA3.displayprofile()을 호출 했을 때
            [실행 결과]
            20250003 학번의 학생의 이름은 김삼이고 ,4.5점입니다.
            가 출력될수 있도록 작성
         */



        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();
        int num3 = 0;
        String name3 = "";
        double score3 = 0;
        System.out.println("이름을 입력하세요 >>> " );
        classA3.name = scanner.next();
        System.out.println("번호를 입력하세요 >>>");
        classA3.num =scanner.nextInt();
        System.out.println("점수를 입력하세요 >>>");
        classA3.score = scanner.nextDouble();

//        displayprofile();


    }
}
