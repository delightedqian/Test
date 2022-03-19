package io.delightedqian;

import java.util.Scanner;

/**
 * Project Name: Case02
 * Description:屏蔽手机号  前三位和后四位 采用的是String的substring构造方法
 * USER: ChenXiaoqian
 * DATE:  2022/3/18
 * TIME:  18:15
 */
public class Case02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的手机号码：");
        String tel = sc.next();
        String before=tel.substring(0,3);
        String after = tel.substring(7);
        System.out.println(before+"****"+after);

    }
}
