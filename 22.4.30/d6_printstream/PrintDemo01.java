package io.delightedqian.d6_printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Project Name: PrintDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/30
 * TIME:  19:15
 */
public class PrintDemo01 {
    public static void main(String[] args) throws Exception {
        //下面两种都可以
        //PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/ps.txt"));
        PrintStream ps = new PrintStream("io-app2/src/ps.txt");
        //PrintWriter ps = new PrintWriter("io-app2/src/ps.txt");
        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);

        //关闭（同时包含刷新）
        ps.close();
    }
}
