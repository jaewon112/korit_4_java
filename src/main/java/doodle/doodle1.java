package doodle;

import java.util.Scanner;

public class doodle1 {

    String name;
    int age;

    public doodle1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String introduce(String name, int age) {
        return "이름 : " + name + " 나이 : " + age + "\n내년에는" + (age + 1) + "살이됩니다";
    }

    public static void main(String[] args) {
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("이름");
        age = scanner.nextInt();
        System.out.println("나이");

        String introduction = introduce(name, age);
        System.out.println(introduction);


    }


}