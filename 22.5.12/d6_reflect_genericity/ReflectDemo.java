package io.delightedqian.d6_reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project Name: ReflectDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  19:22
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
//      编译成Class文件即可插入任何类型
        Class c = list.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean b = (boolean) add.invoke(list, "黑马");
        boolean b2 = (boolean) add.invoke(list, 2);
        System.out.println(b);
        System.out.println(b2);
        System.out.println(list);

        ArrayList list1 = list;
        list1.add("白马");
        System.out.println(list);
    }
}
