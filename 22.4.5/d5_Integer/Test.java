package io.delightedqian.d6_Integer;

import java.util.Scanner;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/5
 * TIME:  11:00
 */
public class Test {
    public static void main(String[] args) {
        Integer a1= 11;
        int a2 = a1;
        System.out.println(a1);
        System.out.println(a2);

        int a3=11;
        Integer a4 = a3;
        System.out.println(a3);
        System.out.println(a4);

//        int b=null;
        Integer b1=null;
        System.out.println("--------");

        Integer i = 23;
        String rs = i.toString();
        System.out.println(rs+1);

        Integer i1 =23;
        String rs1 = Integer.toString(i1);
        System.out.println(rs1+1);

        //其实这是最常用的
        String rs2 = i1 +"";
        System.out.println(rs2+1);
        System.out.println("---------");

        String number = "23";
        int age = Integer.valueOf(number);
        System.out.println(age+1);

        String number1="99.9";
        Double score =Double.valueOf(number1);
        System.out.println(score+0.1);
    }
}
