package io.delightedqian.d7_reflect_framework;

/**
 * Project Name: Student
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  20:06
 */
public class Student {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }
}
