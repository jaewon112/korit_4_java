package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
//        (매개변수)->{실행문}

//기존의 익명 클래스 방식
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello , Java");
            }
        };
//// 이상의 방식으로 익명 클래스를 정의하고
        runnable.run();  //메서드 호출
//
//// 람다식
        Runnable lambdaRunnable = () -> System.out.println("Hello , Java Lambda");
//// 이상의 코드가 익명 클래스에서 메서드를 오버라이드해서 재정의하는 부분까지 전부다 포함되어있음
//// 메서드 호출
//        lambdaRunnable.run();
        // 1. Supplier -> call2() 유형의 함수형 인터페이스
        Supplier<String> stringSupplier = () -> "Hello , Functional Interface and lambda";
        System.out.println(stringSupplier.get());
        // 2. Consumer -> call3() 유형의 함수형 인터페이스
        Consumer<String> stringConsumer = (message) -> System.out.println("메세지 :" + message);
        // 3. Supplier로부터 값을 생성하고 나서 Consumer 를 통해서 출력
        String message = stringSupplier.get();
        // message 변수에 "Hello , Functional Interface and lambda" String 데이터가 도입
        stringConsumer.accept(message);

        Consumer<String> stringConsumer1 = (a) -> System.out.println(a);
        stringConsumer1.accept("d");

        Supplier<String> stringSupplier2 = () -> "ㅎ";

        Consumer<String> stringConsumer2 = (mess) -> System.out.println(mess);

        String mess = stringSupplier2.get();
        stringConsumer2.accept(mess);


    }
}
