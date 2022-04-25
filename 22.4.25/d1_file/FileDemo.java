package io.delightedqian.d1_file;

import java.io.File;

/**
 * Project Name: FileDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/21
 * TIME:  22:36
 */
public class FileDemo {
    public static void main(String[] args) {
        //第一种写法（双\\  第一条是转义第二条  ）
        // File file = new File("D:\\My_ok？\\Java数据\\JavaSEpromax\\movie-buy-app\\movie-buy-app.iml");
        //第二种写法
        // File file = new File("D:/My_ok？/Java数据/JavaSEpromax/movie-buy-app/movie-buy-app.iml");
        //第三种写法（各系统通用）
        File file = new File("D:" + File.separator + "My_ok？" + File.separator + "Java数据" + File.separator + "JavaSEpromax" + File.separator + "movie-buy-app" + File.separator + "movie-buy-app.iml");
        long size = file.length();
        System.out.println(size);

        //绝对路径 与 相对路径
        //绝对路径已经在上面看到
        //相对路径 (一般定义模块中的文件  相对到工程下，也就是它会自动先找到工程)
        File f2 = new File("file-io-app/src/data.txt");
        System.out.println(f2.length());

        //File 类创建对象可以时文件也可以是文件夹  但是会显示为0，
        // 他默认是文件夹的大小，而不是给你算里面的文件大小
        File f3 = new File("D:/My_ok？/Java数据/JavaSEpromax/movie-buy-app");
        System.out.println(f3.length());
    }
}
