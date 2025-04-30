package ch18_static.product;

public class ProductViewMain {

    public static void main(String[] args) {


//    ProductView productView1 = new ProductView();
//    ProductView productView2 = new ProductView(); // 기본생성자를 private로 선언하면 오류 발생
//        productView1.counter 접근 불가능

        //생성자를 private 처리를 했고 , getInstance() 메서드 내에서 instance 정적 변수가 null 이라면
        // instance = new ProductView(); 하기로 정의했었기 때문에 main단계에서는
        // ProductView.getInstance(); 를 통해 객체를 생성함.

        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        /*
            이상의 코드에서 복수의 객체를 생성한 것 처럼 보이지만 실제로 ProductView.getInstance() ; 의 결과값은 동일한
            instance이다.
            그렇다면 실제 생성된 객체의 수는 1개이고 그 한개를 다른 객체 이름에 대입했을 뿐이다.

            그래서 콘솔의 출력결과를 봤을 때,
            1번째 객체가 생성되었습니다
            1번째 객체가 생성되었습니다
            1번째 객체가 생성되었습니다
            가 아니라

            1번째 객체가 생성되었습니다
            로 출력된것을 알 수 있다.
         */
    }
}
