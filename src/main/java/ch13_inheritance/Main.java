package ch13_inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setAnimalName("나비");
        animal1.setAnimalAge(1);
        animal1.move();

        //부모 메서드를 그대로 가져온 사례
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(3);
        tiger1.move();
//        tiger1.hunt();  오류 발생 -> 부모 클래스는 자식클래스의 필드 및 메서드에 접근 불가능
        tiger1.setStriped(true);
//        animal1.setStripted(false); 오류 발생 -> 16번 라인과 동일한 이유

        Human human1 = new Human();
        human1.setAnimalAge(30);
        human1.setAnimalName("김재원");
        human1.move();
        int age = human1.getAnimalAge();
        System.out.println("나이를 출력합니다 : " + age);
        System.out.println(human1.getAnimalName());
        human1.read("자바의 기초");
    }
}
