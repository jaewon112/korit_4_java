package ch12_arrays;

public class Array02 {

    public static void main(String[] args) {
        // int 배열 선언 및 초기화
        int[] intArr01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Array01에서 배열의 element를 출력하는 방법을 봤습니다.
        int sum = 0;
        //이상의 변수를 사용하여 배열 elemet의 합을 구하는 반복문을 작성하시오

        for (int i = 0; i < intArr01.length; i++) {
            sum += intArr01[i];
        }
        System.out.println("배열의 합 : "+sum);

        int sumEven = 0;
        // intArr01에서 짝수만 뽑아서 더하는 방법
        for (int i = 0; i < intArr01.length; i++) {
            if (intArr01[i] % 2 == 0) {
                sumEven +=intArr01[i];
            }
        }
        System.out.println("짝수의 합 :" +sumEven);

        // 비어있는 배열에 (혹은 기존에 값이 있는 배열에) 값을 재대입하는 방법
        int[] intArray02 = new int[100]; // 빈 배열 선언
        intArray02[0] = 100;
        intArray02[1] = 100;
        intArray02[2] = 100;
        intArray02[3] = 100;
        // intArray02에 전부 다 100 대입
        for (int i=0; i < intArray02.length; i++) {
            intArray02[i] = 100;
        }
        System.out.println(intArray02[99]);
        // intArr02에다가 다시 값을 재대입
        for (int i = 0; i < intArray02.length; i++) {
            intArray02[i] = (i+1);
        }



        int total = 0;
        // 이상의 변수를 사용하여 intArr02의 모든 elemet의 합을 구하시오
        for (int i = 0; i < intArray02.length; i++) {
            total += intArray02[i];
        }
        System.out.println("합계 : "+ total);
        int total3 = 0;
        //이상의 변수를 사용하여 intArr2에서 3으로 나누어떨어지는 element의 합을 구하시오
        for (int i = 0; i < intArray02.length; i++) {
            if (intArray02[i] % 3 == 0) {
                total3 += intArray02[i];
            }
        }
        System.out.println("3의 배수의 합 : "+ total3);

        total = 0;
        total3 = 0;
        //이상의 코드 구조를 확인해보면 동일한 반복문이 3번 쓰엿다는점을 확인가능

        //이를 축약시키면
        for (int i = 0; i < intArray02.length; i++) {
            // 값 대입 영역
            intArray02[i] = i+2;
            //합 영역
            total += intArray02[i];
            // 3의 배수의 합 구하는 조건문 영역
            if (intArray02[i] % 3 == 0) {
                total3 += intArray02[i];
            }
        }
        System.out.println("전체 합 : " + total);
        System.out.println("3의 배수 합 : " + total3);


    }

}
