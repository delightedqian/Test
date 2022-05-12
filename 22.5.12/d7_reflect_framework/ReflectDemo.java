package io.delightedqian.d7_reflect_framework;

/**
 * Project Name: ReflectDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  20:06
 */
public class ReflectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张扬");
        s.setSex('男');
        s.setAge(18);
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("利好");
        t.setSex('男');
        t.setSalary(2500.0);

        MybatisUtil.save(t);

    }
}
