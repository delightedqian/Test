package io.delightedqian.dayhomework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/23
 * TIME:  18:04
 */
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Student){
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }else
            return false;

    }
    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }
}
public class Test {
    public static void main(String[] args) {
        Set<Student> hs = new HashSet<>();
        Student s1 = new Student("张三",15);
        Student s2 = new Student("张三",15);
        Student s3 = new Student("李四",14);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
