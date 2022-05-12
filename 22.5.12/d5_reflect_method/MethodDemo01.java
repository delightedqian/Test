package io.delightedqian.d5_reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Project Name: MethodDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  18:32
 */
public class MethodDemo01 {
    //    获取方法数组
    @Test
    public void getDeclaredMethods() {
        Class c = Dog.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "返回类型" + method.getReturnType()
                    + "参数个数" + method.getParameterCount());
        }
    }
    //    获取单个方法
    @Test
    public void getDeclaredMethod() throws Exception {
        Class c = Dog.class;
        Method method = c.getDeclaredMethod("eat");
        Method method2 = c.getDeclaredMethod("eat", String.class);
//
        method2.setAccessible(true);
//      触发方法执行
        Dog d = new Dog();
        method.invoke(d);
        System.out.println("-------------------");
        Object result2 = method2.invoke(d, "骨头");
        System.out.println(result2);
    }
}
