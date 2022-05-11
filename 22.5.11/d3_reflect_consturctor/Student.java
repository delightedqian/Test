package io.delightedqian.d3_reflect_consturctor;

/**
 * Project Name: Student
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/11
 * TIME:  19:32
 */
public class Student {
    private String name;
    private int age;

    private Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
