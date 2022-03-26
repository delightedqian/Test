package io.delightedqian.d12_this;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/25
 * TIME:  19:28
 */
public class Test {
    public static void main(String[] args) {
        Student s1= new Student("张三","冰火岛自学");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("李四");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());

    }
}
