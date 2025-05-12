package ch10_setter_getter;

import java.util.Scanner;

/*
 이제 setAge 자동완성한 것을 기본으로 두고 , 편집
    나이가 0미만이거나 200초과인 age가 매개변수로 들어오게 된다면 , 객체의 속성에 들어갈 수 없도록 할 예정이빈다.
    md파일을 참조하여 setAge를 완성하고 PersonMain에서 person1 객체를 '기본생성자로 생성'하고
    person1.setName("김일")
    person1.setAge("243"); 을 입력했을 때 , 콘솔창에 실행 예시로
    person1.setAge(21);

    실행 예

    기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
    이름이 입력되었습니다. : 김일
    불가능한 나이 입력입니다. 현재 나이 : 0
    나이가 입력되었습니다
    변경 전 나이 : 0
    변경 후 나이 : 21
 */
public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("김일");
        person1.setAge(21);

        Person person2 = new Person("이이" ,32);

        // 이이라는 사람의 이름을 강이 로 바꾸고 싶다면 두 가지 방법이 있다.
        // # 1. 객체명.속성명
//        person2.name ="강이";    // Person.java에 private 적용하면 오류 발생
        // # 2. setName()을 이용하는 방법
        person2.setName("최이");
        person2.setAge(90);

        //마찬가지로 콘솔창에 person2의 name을 출력하는 방법 두가지.
        // #1.
//        System.out.println(person2.name);
        // #2. getName() > call3()
//        System.out.println(person2.getName());

        //call1() / call() 유형의 경우 return이 없는 대신에 콘솔창에 출력하기 위해서는 메서드 내에 sout()을 구현할 필요가 있었다.
        //이상의 경우 main 단계에서 메서드 호출을 하기만 하면 콘솔창에 결과가 출력된다는 장점이 있기는 하지만 '데이터의 가공'이 어렵습니다
//        person2.getName();
        person2.getName2();

    }
}
