package io.delightedqian.d1_file;

import java.io.File;

/**
 * Project Name: FileDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/23
 * TIME:  12:17
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File f1 = new File("D:\\javatest\\1.png");
        System.out.println(f1.delete());
        File f2 = new File("D:\\javatest");
        System.out.println(f2.delete());
    }
}
