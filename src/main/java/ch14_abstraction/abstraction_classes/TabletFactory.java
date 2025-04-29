package ch14_abstraction.abstraction_classes;
/*
    지시 사항
    1. Factory 클래스를 상속받을 것(오류들 처리)
    2. TabletFactory의 고유 method인 upgrade(String model)을 call2() 유형으로 정의
        객체명.upgrade("아이패드 프로 13인치 8세대"); 로 호출하면
        "아이패드 프로 13인치 8세대로 업그레이드합니다." 라고 콘솔에 출력될 수 있게 작성.
    3. produce() / manage() 메서드를 태블릿 공장에 맞게 적절히 수정할 것 (PhoneFactory참조)
    4. main으로 이동해서 tablet1 객체를 생성하고 애플 태블릿 공장으로 이름 붙일것.
    5. produce() 호출
    6. manage() 호출
    7. upgrade ("아이패드 미니 7세대")를 호출
 */
public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {

    }

    @Override
    public void manage() {

    }

}
