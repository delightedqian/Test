package io.delightedqian.d2_params;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Project Name: MethodDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/13
 * TIME:  20:11
 */
public class MethodDemo {
    public static void main(String[] args) {

        add(12);
        add(20,30,30);
        add(25,45,45,85,7452,45,15,15,15);
    }
    public static void add(int a,int...num){
        System.out.println("元素个数"+num.length);
        System.out.println("元素内容"+Arrays.toString(num));
    }
}
