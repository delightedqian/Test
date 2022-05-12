package io.delightedqian.d7_reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * Project Name: MybatisUtil
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  20:06
 */
public class MybatisUtil {
    public static void save(Object obj) {
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("junit-reflect-annotation-proxy-app//src//data.txt",true))
        ) {
            Class c = obj.getClass();
            ps.println("====================" + c.getSimpleName() + "===================");
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "======>" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
