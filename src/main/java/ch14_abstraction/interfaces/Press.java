package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface이기 때문에 변수 앞에 접근지정자를 명시하지 않았지만 public final 에 해당한다.
        또한 , 상수이기에 상수명을 나타내는  NAME으로 작성하였고 , 일반 클래스의 field 선언처럼 String name;으로 작성하는것이 불가능하다

     */
//    String name;
//    public Press(){};
//    void popOut(){
//        System.out.println("추상 메서드만 가능 / 일반 메서드 불가능 예시");
//    }
    void onPressed(); // 아무 표시도 안했지만 abstract이다.

    // interface를 이용하여 Up.java / Down.java를 생성하고
    // void 형태인 onUp() / onDown() 메서드를 선언
}
