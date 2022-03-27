package io.delightedqian.d9_abstract_template;

/**
 * Project Name: Student
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  15:40
 */
public abstract class Student {
    public void write() {
        System.out.println("\t\t\t\t《我的爸爸》");
        System.out.println("你的爸爸是啥样，来说说");
        System.out.println(writeMain());
        System.out.println("我的爸爸简直太好了");
    }
    public abstract String writeMain();
}
