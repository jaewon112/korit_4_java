package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성 -> 여태까지 쓰지않은 방식으로 실행
        // List 선언 및 초기화
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");
        // ForEach 예제
        fruits.forEach(fruit -> System.out.println(fruit));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // forEach 는 Consumer를 사용
        numbers.forEach(number -> System.out.println(   " 두 배 값 : " + (number * 2)));

        List<Integer> aaa = Arrays.asList(12);

        aaa.forEach(a -> System.out.println(a));

    }
}
