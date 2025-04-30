package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest();


        objectTest1.setName("김재원");
        objectTest1.setAddress("창원시 진해구");

        objectTest1.displayInfo();

        System.out.println(objectTest1);

        Teacher teacher2 = new Teacher("김일", "고등");

        System.out.println(teacher2);
    }
}
