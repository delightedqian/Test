package io.delightedqian;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/8
 * TIME:  9:49
 */
public class TestDemo01 {
    public static void main(String[] args) {
//        System.out.println(isSame(100000,14545));
        isPrint(5);
    }
    public static void isPrint(byte num){
        System.out.println(num);
    }
    public static void isPrint(short num){
        System.out.println(num);
    }
    public static void isPrint(int num){
        System.out.println(num);
    }
    public static void isPrint(long num){
        System.out.println(num);
    }
    public static void isPrint(char num){
        System.out.println(num);
    }
    public static void isPrint(float num){
        System.out.println(num);
    }
    public static void isPrint(double num){
        System.out.println(num);
    }
    public static void isPrint(boolean num){
        System.out.println(num);
    }




    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行");
        return a==b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行");
        return a==b;
    }
    public static boolean isSame(int a,int b){
        System.out.println("两个int参数的方法执行");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("两个long参数的方法执行");
        return a==b;
    }
}


















