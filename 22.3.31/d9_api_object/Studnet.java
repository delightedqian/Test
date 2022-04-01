package io.delightedqian.d9_api_object;

import java.util.Objects;

/**
 * Project Name: Studnet
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/31
 * TIME:  19:38
 */
public class Studnet {
    private String name;
    private char sex;
    private int age;

    public Studnet() {
    }

    public Studnet(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Studnet{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studnet studnet = (Studnet) o;
        return sex == studnet.sex &&
                age == studnet.age &&
                Objects.equals(name, studnet.name);
    }


}
