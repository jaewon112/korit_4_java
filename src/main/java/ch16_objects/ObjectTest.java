package ch16_objects;
/*
    필드를 전부 private로 선언하시오.
    String name;
    String address;

    기본생성자 , 매개변수 생성자 (하나짜리 두개 두개짜리 하나) 생성
    ex) 기본 생성자로 객체가 생성되었습니다.
        name 매개변수로 객체가 생성되었습니다.
        name , adress 매개변수로 객체가 생성되었습니다. 출력
        getter / setter 정의

        displayInfo() 메서드를 call() 유형으로 정의
        ex)
        이름:
        주소:

        ObjectTestMain 에서 ObjectTest의 객체를 생성하고 이름: 내 이름 , 주소 : 내 주소 입력하고 displayInfo()호출
 */
public class ObjectTest {

    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        System.out.println("name 매개변수로 객체가 생성되었습니다.");
        this.name = name;
    }

    public ObjectTest(String name, String address) {
        System.out.println("name , address 매개변수로 객체가 생성되었습니다.");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }
    /*
//    public ObjectTest(String address) {
//
//    }
    //이상의 코드가 발생하는 이유
    1. 매개변수와 field는 서로 다른 개념
            호출 상황을 가정했을 때 -> ObjectTestMain에서 객체 생성을 하게 됨
        ObjectTest object1 = new ObjectTest("이름");
        ObjectTest object2 = new ObjectTest("주소");
        // 자바는 동일한 field에 두개의 String을 생성못함
    */

    // Object 클래스의 메서드들을 override할것임.


    @Override
    public String toString() {
        return
                "이름 :" + name +"\n"+
                "주소 : " + address  ;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
