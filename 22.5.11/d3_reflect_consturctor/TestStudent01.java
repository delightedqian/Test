package io.delightedqian.d3_reflect_consturctor;

import org.junit.After;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Project Name: TestStudent01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/11
 * TIME:  19:34
 */
public class TestStudent01 {
    //1  第一种  返回构造器对象数组  只能拿public的
    @Test
    public void getConstructors() {
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "=======>" + constructor.getParameterCount());
        }
    }

    //2  第二种   返回构造器对象数组  能拿所有的
    @Test
    public void getDeclaredConstructors() {
        Class c = Student.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "=======>" + constructor.getParameterCount());
        }
    }

    //3    第三种  返回单个构造器对象  只能拿public的
    @Test
    public void getConstructor() throws Exception {
        Class c = Student.class;
        Constructor cons = c.getConstructor();
        System.out.println(cons.getName() + "=======>" + cons.getParameterCount());
    }

    //3    第四种  返回单个构造器对象  能拿所有的
    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "=======>" + cons.getParameterCount());
//       获取有参的
        Constructor cons1 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(cons1.getName() + "=======>" + cons1.getParameterCount());
    }

}
