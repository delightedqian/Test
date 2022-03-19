package io.delightedqian;

import java.util.Random;
import java.util.Scanner;

/**
 * Project Name: TestDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/17
 * TIME:  20:19
 */
public class Case01User {
    public static void main(String[] args) {
        /*下面代码是验证码登录
         * 首先 定义String类型的字符串
         * 用Random类的nextInt自动生成一个随机数，
         * 用String类的charAt去拿，循环五次下来便获得一组五位的验证码*/

        String code = "";
        String all = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ1234567890";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(all.length());
            char c = all.charAt(index);
            code += c;
        }
        System.out.println(code);
        /*下面代码是模拟用户登录界面
         * 用户只有三次机会*/
        String okName = "delighted";
        String okPassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (okName.equals(name)) {
                if (okPassword.equals(password)) {
                    System.out.println("登录成功！");
                } else {
                    System.out.println("密码错误,你还剩余 " + (3 - i) + "次机会");
                }

            } else {
                System.out.println("用户名错误，你还剩余" + (3 - i) + "次机会");
            }
            /*if (okName.equals(name) && okPassword.equals(password)) {
                System.out.println("登录成功！");
            } else {
                System.out.println("用户名或密码错误！");
            }*/

        }


    }
}
