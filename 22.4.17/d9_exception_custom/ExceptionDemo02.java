package io.delightedqian.d9_exception_custom;

/**
 * Project Name: ExceptionDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  21:00
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        try {
            checkAge(-12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) {
        if (age < 0 || age > 200) {
            throw new AgeIllegalRuntimeException(age + "is illegal");
        } else {
            System.out.println("年龄合法，推荐商品");
        }
    }

}


