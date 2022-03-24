package io.delightedqian.d5_extends_test;

/**
 * Project Name: People
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  16:08
 */
public class People {
    private String name;
    private String age;

    public void queryCourse() {
        System.out.println(name + "在查看课表");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
