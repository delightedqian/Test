package io.delightedqian;

import java.util.Scanner;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/17
 * TIME:  18:52
 */
public class TestDemo01 {
    public static void main(String[] args) {
        String name = "我爱你中国love";

        System.out.println(name.startsWith("我爱"));


        System.out.println(name.contains("我爱你"));
        System.out.println(name.replace("love", "leeee"));
        System.out.println( name.substring(0,2));
        System.out.println(name.length());
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);

        }
    }



    public static void main1(String[] args) {
        String okName = "itheima";
        String okPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称");
        String name = sc.next();
        System.out.println("登录密码");
        String password = sc.next();

        if (okName.equals(name) && okPassword.equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("用户名或密码错误");
        }

    }
}
