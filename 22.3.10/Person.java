package io.delightedqian;

/**
 * Project Name: Person
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/10
 * TIME:  9:07
 */
public class Person {
    String name;
    private int age;
    private boolean male;

    public void setMale(boolean nu) {
        male = nu;
    }

    public boolean isMale() {
        return male;
    }

    public void setAge(int num) {
        if (num > 0) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

    /*public void show() {
        System.out.println("我叫" + name + "年龄" + age);
    }*/
}
