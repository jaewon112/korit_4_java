package ch23_lambda;


public class CalculatorMain {
    //정적 메서드 정의
    public static int operate(int a, int b , Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // Calculator interface를 활용하여 작성할 예정
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;       // y 가 0이면 예외발생

        System.out.println("2 + 3 =" + operate(2, 3, add));
        System.out.println("2 - 3 =" + operate(2, 3, sub));
        System.out.println("2 * 3 =" + operate(2, 3, mul));
        System.out.println("2 / 3 =" + operate(2, 3, div));

        Calculator div2 = (x, y) -> {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");

                // return 이 필요한 이유는 Calculator가 int타입이기 때문
                // return 으로 y 가 0일 경우 실행을 종료하기위해 return 0; 을 명시해줘야함
                return 0;
            }
            return x / y;
        };

//        System.out.println("4 / 0 = " + operate(3, 0, div));          //예외 발생
        System.out.println("4 / 0 = " + operate(3, 0, div2));
    }

}
