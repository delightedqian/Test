package io.delightedqian.d4_exception_runtimeException;

import java.util.stream.Stream;

/**
 * Project Name: ExceptionDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  16:12
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //1
//        int []arr= {1,2,3};
//        System.out.println(arr[4]);
        //2
        String name = null;
        System.out.println(name);
        // System.out.println(name.length());
        //3 类型转换异常
        Object o = 23;
        // String s = (String)o;
        //4 数学操作异常
        //int a = 10/0;
        //5 数字转换异常
        String number = "3a";
        Integer it = Integer.valueOf(number);
        System.out.println(it+1);

    }
}
