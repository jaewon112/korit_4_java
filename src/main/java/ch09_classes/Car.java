package ch09_classes;

public class Car {
    /*
        색상(빨강/노랑 etc) , 속도 (100,200 etc) 필드를 정의하고
        drive() /brake() / displayCarInfo() 메서드를 정의하시오.
        1. drive 결과값
            : 빨강 자동차가 주행중입니다.
                최고 속도는 100입니다
         2. brake*() 결과 값
            :빨강 자동차가 멈췄습니다
         3. displayInfo() 결과값
            : 이 차의 색은 빨간색이고 , 최고 속도는 100km/h 입니다. 그냥저냥입니다. -> 뒷부분 if문작성

            :이 차의 색은 노랑색 , 최고 속도는 200km/h 입니다 빠릅니다. -> 100이하면 그냥저냥 100초과면 빠릅니다가 출력될수 있도록 매서드를 정의.

            다 작성하면 car1의 색깔 빨강 / 속도 100으로 생성
            car2의 색깔 노랑 / 속도 200으로 생성한 후
            각각 drive()/brake()/displayCarInfo()를 실행하시고 콘솔창에 결과를 출력하시오.
     */

    String color;
    int speed;
    //메서드 정의

    public void drive(){
        System.out.println(color + "자동차가 주행중입니다.\n최고 속도는" + speed + "입니다");
    }
    public String getBrake() {
        return color + " 자동차가 멈췄습니다";
    }

    public void displayCarInfo() {
//        String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다");
//        System.out.println("이 차의 색깔은 " + color + "색이고,");
//        System.out.println("최고 속도는 " + speed + "km/h 입니다"+eval);
       String eval;
        if (speed > 101){
            eval= "빠릅니다.";
        }else{
            eval= "그냥저냥입니다.";
        }
        System.out.println("이 차의 색은" + color + "이고, 속도는" + speed + "km/h 입니다." +eval);
    }
     String drive;
    String brake;

}
