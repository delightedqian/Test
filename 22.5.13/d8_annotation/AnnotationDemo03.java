package io.delightedqian.d8_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Project Name: AnnotationDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/13
 * TIME:  11:33
 */
public class AnnotationDemo03 {
    public void test1() {
        System.out.println("===test1==");
    }

    @MyTest
    public void test2() {
        System.out.println("===test2==");
    }

    public void test3() {
        System.out.println("===test3==");
    }
    /*
    * 由于Java的JUnit框架右键可以直接运行，咱们的不行，用main方法来代替*/
    public static void main(String[] args) throws Exception {
//      创建一个对象，用来触发执行
        AnnotationDemo03 a = new AnnotationDemo03();
            Class c = AnnotationDemo03.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(a);
            }
        }
    }
}
