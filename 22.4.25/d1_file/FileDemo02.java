package io.delightedqian.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 * Project Name: FileDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/23
 * TIME:  8:22
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File f1 = new File("D:/My_ok？/Java数据/JavaSEpromax/movie-buy-app/movie-buy-app.iml");
        //a.获取绝对路径
        System.out.println(f1.getAbsolutePath());
        //b.获取文件定义的时候使用的路径
        System.out.println(f1.getPath());
        //c.获取文件的名称，带后缀
        System.out.println(f1.getName());
        //d.获取文件的大小 字节个数
        System.out.println(f1.length());
        //e.获取文件最后修改的时间
        long time = f1.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        //f.判断是文件还是文件夹
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println("-----------------------------");

        File f2 = new File("file-io-app\\src\\data.txt");
        //a.获取绝对路径
        System.out.println(f2.getAbsolutePath());
        //b.获取文件定义的时候使用的路径
        System.out.println(f2.getPath());
        //c.获取文件的名称，带后缀
        System.out.println(f2.getName());
        //d.获取文件的大小 字节个数
        System.out.println(f2.length());
        //e.获取文件最后修改的时间
        long time1 = f2.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time1));
        //f.判断是文件还是文件夹
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
    }
}
