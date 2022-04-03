package io.delightedqian.d13_System;

import java.math.BigDecimal;

/**
 * Project Name: Test01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/3
 * TIME:  14:50
 */
public class Test01 {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            System.out.println(i);
//
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println((endTime - startTime) / 1000.0);
//        System.out.println(0.09+0.01);
//        double a=0.1;
//        double b=0.2;
//        double c=a+b;
//        System.out.println(c);
//
//        BigDecimal a1 = BigDecimal.valueOf(a);
//        BigDecimal a2 = BigDecimal.valueOf(b);
//        BigDecimal c1= a1.add(a2);
//        double rs = c1.doubleValue();
//        System.out.println(rs);
//        System.out.println(c1);

          BigDecimal a1 = BigDecimal.valueOf(10.0);
          BigDecimal a2 = BigDecimal.valueOf(3.0);
          BigDecimal c1 = a1.divide(a2,2,BigDecimal.ROUND_HALF_UP);
          System.out.println(c1);
    }
}
