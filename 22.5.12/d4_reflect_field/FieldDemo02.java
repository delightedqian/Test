package io.delightedqian.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Project Name: FieldDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  16:39
 */
public class FieldDemo02 {
    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        Field f1 = c.getDeclaredField("age");

        f1.setAccessible(true);
//      赋值
        Student s = new Student();
        f1.set(s, 18);
        System.out.println(s);
//      取值
        int age = (int) f1.get(s);
        System.out.println(age);
    }

}
