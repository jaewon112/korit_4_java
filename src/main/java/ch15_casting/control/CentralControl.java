package ch15_casting.control;

import ch14_abstraction.abstraction_classes.PhoneFactory;

/*
    LED 클래스 / Mouse 클래스를 생성하고 적절하게 메서드의 구현부를 완성
 */
public class CentralControl {
    //필드 선언
    private Power[] deviceArray;
    // 매개변수 생성자를 작성하시오.

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main에서 확인결과 곧장 element가 있는 배열을 집어넣지 못했으니까 Power의 자식 클래스의 인스턴스들을 집어넣는 메서드를 정의

    public void addDevice(Power device){
        // -매개변수의 자료형이 Power 인 이유는
        // 어짜피 암시적으로 업캐스팅 되니까 Computer / LED / Mouse에 해당하는 객체들을 신경쓰지 않고 넣기 위해
        int emptyIndex = checkEmpty(); // 아직 정의 안함
        //명확한 설계 하에 작성하게 된다면 이런 일이 안 벌어지겠지만 매주 자주 발생하는 상황.
        if (emptyIndex == -1) {                 // checkEmpty() 메서드의 결과값이 -1이라면
                                                // 배열이 비어있지 않다는 의미
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;                         //메서드 종료 키워드
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        /*
            객체명.getClass() -> 패키지명을 포함한 클래스명이 반환됨(@주소지가 날라감)
            객체명.getClass(0.getSimpleName()-> 패키지명도 날라가고 클래스명만 반환됨.
            메서드 체이닝이라는 표현으로 자주 쓰임
         */
    }
    private int checkEmpty() {       // 비어있는 배열의 index number를 반환하기 위한 method
        // 배열을 반복문을 돌려가지고 null값 빠져나오는 애를 return 하면 된다.
        // 이상의 경우 굳이 정신나간 방법으로 코딩하지 않는 이상 가장 빨리 만나게 되는 null의 index number가 반환될겁니다.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return  i;
            }
        }
        //근데 안 비어있는 경우도 잇음
        return -1;
        /*
            Java에서 index 넘버에는 음수값이 없기 때문에 0이상이 정수이다 .
            (근데 python에는 마이너스index가 있음), 실패를 나타낼때 -1을 쓰는데 이는 ,
            "유효하지 않는 인덱스" = false라는 의미로 자주 쓰인다.
         */
    }

    public void powerOn() {
        // deviceArray 배열 내에 있는 각 element들은 Power 서브 클래스의 인스턴스에 해당
        // 그러면 .on() / .off()를 전부다 가지고 있을 거고, instanceof를 쓸 필요 없음
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;       // 메서드를 종료하는게 아니라 다음 반복으로 넘어가는 키워드
            }
            device.on();
        }
    }

    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            Power device = deviceArray[i];
            if (device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            device.off();
        }
    }

    // 배열 내부를 돌면서 각 element의 고유 메서드를 호출할 수 있도록 메서드를 작성할 예정
    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof Tv) {        // 이 조건문이 true라면 해당 element는 tv의 인스턴스
                Tv tv = (Tv) device;                // 명시적 다운캐스팅.
                tv.channelUp();                     // 마찬가지로 tv로 다운캐스팅이 이루어져서 고유 메서드 실행 가능
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) device;
                smartphone.touchScreen();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else {
                System.out.println();
            }
        }
    }

}
