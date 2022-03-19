package io.delightedqian;

import java.util.Scanner;


/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/11
 * TIME:  10:48
 */
public class TestDemo01 {
    public static void main(String[] args) {
        //普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
        //匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

        //使用一般写法传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
        //使用匿名对象                           
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println(num);
    }

    //        使用一般方法返回值
//    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc ;
//    }
    //        使用匿名方法返回值
    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }


    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);

    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int number = sc.nextInt();
        System.out.println(number);

        String st =sc.next();
        System.out.println(st);*/
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        System.out.println(theBiggest(a, b, c));

//        System.out.println(addAll(a, b));
    }

    public static int addAll(int a, int b) {
        return a + b;
    }

    public static int theBiggest(int a, int b, int c) {
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;

    }
}
