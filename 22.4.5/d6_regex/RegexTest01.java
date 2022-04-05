package io.delightedqian.d6_regex;

import java.util.Scanner;

/**
 * Project Name: RegexTest01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/5
 * TIME:  19:55
 */
public class RegexTest01 {
    public static void main(String[] args) {

        //checkPhone();
        // checkEmail();
        //checkTel();
        checkMoney();
    }

    public static void checkMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        while (true) {
            String tel = sc.next();

            if (tel.matches("\\d{0,9}(\\.\\d{0,9})?")) {
                System.out.println("金额格式正确");
                break;
            } else {
                System.out.println("金额格式不正确！");
                break;
            }
        }
    }
    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话地址：");
        while (true) {
            String tel = sc.next();

            if (tel.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("注册成功！");
                break;
            } else {
                System.out.println("注册失败！");
                break;
            }
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱地址：");
        while (true) {
            String email = sc.next();

            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("注册成功！");
                break;
            } else {
                System.out.println("注册失败！");
                break;
            }
        }
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        while (true) {
            String phone = sc.next();

            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("注册成功！");
                break;
            } else {
                System.out.println("注册失败！");
                break;
            }
        }
    }
}
