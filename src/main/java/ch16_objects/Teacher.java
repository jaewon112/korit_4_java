package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String shcoolName;

    public Teacher(String name, String shcoolName) {
        this.name = name;
        this.shcoolName = shcoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShcoolName() {
        return shcoolName;
    }

    public void setShcoolName(String shcoolName) {
        this.shcoolName = shcoolName;
    }

    @Override
    public String toString() {
        return   name + "선생님의 근무지는" +
                 shcoolName + "학교 입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(shcoolName, teacher.shcoolName);
    }
    // 객체명1.equals(객체명2)

    @Override
    public int hashCode() {
        return Objects.hash(name, shcoolName);
    }
}
