package io.delightedqian.d5_extends_test;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  16:05
 */
public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("张三");
        s.setAge("99");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();

    }
}
