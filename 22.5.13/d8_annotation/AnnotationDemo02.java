package io.delightedqian.d8_annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Project Name: AnnotationDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/13
 * TIME:  10:24
 */
public class AnnotationDemo02 {
    @Test
    public void parseMethod() throws NoSuchMethodException {
//      解析类上的注解
        Class c = BookStore.class;
//      解析方法上的注解  把下面的c换成m就ok
        //Method m = c.getDeclaredMethod("method");
        if (c.isAnnotationPresent(Book1.class)) {
            Book1 book1 = (Book1) c.getDeclaredAnnotation(Book1.class);
            System.out.println(book1.value());
            System.out.println(book1.price());
            System.out.println(Arrays.toString(book1.authors()));
        }
    }
}
@Book1(value = "《围城》", price = 99.9, authors = {"钱钟书"})
class BookStore {
    @Book1(value = "《平凡的世界》", price = 9.9, authors = {"路遥"})
    public void method() {
    }
}