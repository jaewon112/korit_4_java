package doodle;

import java.util.Scanner;

import static doodle.doodle2.introduce;

public class doodle3 {
    public static void main(String[] args) {
        String name ;
        int age;
        Scanner scanner = new Scanner(System.in);
        name =scanner.nextLine();
        System.out.println("이름");
        age = scanner.nextInt();
        System.out.println("나이");

        String introduction = introduce(name,age);
        System.out.println(introduction);
    }
}
