package io.delightedqian.d7_reflect_framework;

/**
 * Project Name: Teacher
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  20:06
 */
public class Teacher {
    private String name;
    private char sex;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name, char sex, double salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
}
