package ch18_static.builders;

public class Person {

    private String name;
    private int age;
    private String address;

    //빌더패턴 작성
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
//        this.address = builder.address();
    }
    public static class Builder{
            private String name;
            private int age;
            private String adress;

            // 이하의 코드에 주목 -> method들을 정의할 예정
            // method는 대부분 행위를 나타내기 때문에 동사로 작성하지만 Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드 명을 씀.
            // 예를 들어 builder.name("안근수"); / builder.age(38); 과 같은 방식이 됨
        public Builder name(String name) {
            this.name=name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String adress) {
            this.adress = adress;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
