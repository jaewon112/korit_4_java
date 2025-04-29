package ch15_casting.control;

public class Main {

    public static void main(String[] args) {
        //객체 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        CentralControl control1= new CentralControl(new Power[5]);

        //배열 생성 방법을 떠올려서 5개짜리 사이즈의 배열을 CentralControl() 생성자의 argument로 집어넣으시오|
//        Power[] powers = {computer1,led1,mouse1}; // -> 암시적 업캐스팅이 이루어져있음.
//        CentralControl control2 = new CentralControl(powers);
        //빈 배열을 집어넣는 것만이 가능한게 아니라 , 미리 배열을 생성해놓고 그 배열을 control2 생성시에 집어넣는 방법이 가능함.
        // 다만 이상의 경우 구글홈미니를 만들어놨는데 거기에 default로 컴퓨터 , LED , 마우스가 한대씩 등록되어있다고 봐야하기 때문에
        // 9번 라인에 작성한 control1을 기준으로 수업합니다.

        control1.addDevice(computer1);      // 여기서 0번 인덱스를 차지했기 때문에
        control1.addDevice(led1);
        control1.addDevice(mouse1);

        control1.powerOn();


        control1.powerOff();


//        System.out.println(control1.checkEmpty());  // 결과값 : 1 -> checkEmpty()를 private 처리함

    }
}
