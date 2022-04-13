package io.delightedqian.d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * Project Name: SetDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/12
 * TIME:  19:43
 */
public class SetDemo03 {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student stu = new Student("张三",18,"男");
        Student stu1 = new Student("张三",18,"男");
        Student stu2 = new Student("李四",21,"男");
        sets.add(stu);
        sets.add(stu1);
        sets.add(stu2);
        System.out.println(sets);
    }
}
