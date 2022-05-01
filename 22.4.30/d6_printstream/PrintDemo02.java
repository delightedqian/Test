package io.delightedqian.d6_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Project Name: PrintDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/30
 * TIME:  19:47
 */
public class PrintDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        //改变输出语句的位置
        PrintStream ps = new PrintStream("io-app2/src/log.txt");
        System.setOut(ps);
        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}
