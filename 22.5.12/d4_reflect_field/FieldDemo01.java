package io.delightedqian.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Project Name: FieldDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  16:34
 */
public class FieldDemo01 {
//    获取成员变量数组
    @Test
    public void getDeclaredFields() {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "=====>" + field.getType());
        }
    }
//  获取成单个员变量
    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        Field f1 = c.getDeclaredField("name");
        System.out.println(f1.getName()+"====>"+f1.getType());
    }
}
