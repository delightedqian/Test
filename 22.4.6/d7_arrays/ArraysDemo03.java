package io.delightedqian.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Project Name: ArraysDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/7
 * TIME:  20:52
 */
public class ArraysDemo03 {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        students[0]=new Student("张三",19,175.5);
        students[1]=new Student("李四",18,165.5);
        students[2]=new Student("王五",20,195.5);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            //按照自己的规则进行比较
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                //return o1.getAge()-o2.getAge();
                //按照身高升序
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
