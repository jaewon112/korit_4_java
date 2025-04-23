package ch05_conversion;

public class Main {
    public static void main(String[] args) {

        char cast1 = 'A';
        // 업캐스팅 방법 #1
        // 형변환을 하기 위해서는 '(바꿀데이터타입)변수명'으로 작성하시면 됩니다.
        System.out.println("원형 : " + cast1);
        System.out.println("변형 : " + (int)cast1);       // 숫자 65 = 'A'

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);

        // 업캐스팅 방법 #2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법입니다.
        char cast3 = 'b';

        int casted3 = (int)cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);
        System.out.println();

        // 다운캐스팅 파트
        int cast4 = 99;
        int cast5 = 100;

        System.out.println("cast4 원형:" + cast4);
        System.out.println("cast4 변형:" + (char)cast4);
//
//        System.out.println();
//        System.out.println("cast5 원형:" + cast5);
//        System.out.println("cast5 변형:" + (char)cast5);

        char casted5 = (char)cast5;
        System.out.println("원형 " + cast5);
        System.out.println("변형 " + casted5);

        /*
            추후 수업에서 적용될 개념인데 , upcasting의 경우 메모리 용량이 커지기만 하면 되니까
            기존 데이터가 변형이 일어나지 않기 때문에 암시적(implicit)으로 변형이 가능한 반면,
            downcasting 의 경우에는 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는 경우가 있습니다.
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는 명시(explicit) 적으로만 변형이 가능합니다.

            -> 나중에 참조자료형캐스팅 이라는 개념과 연결됩니다. 꼭 복습하시기 바랍니다.
         */
    }
}
