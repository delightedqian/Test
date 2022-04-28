package io.delightedqian.d3_char_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.Buffer;

/**
 * Project Name: FileReaderDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  20:14
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("io-app2\\src\\out01.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //a.public void write(int c):写一个字符出去
        bw.write(98);
        bw.write('a');
        bw.write('序');
        //换行
        bw.newLine();
        //b.public void write(String c)写一个字符串出去
        bw.write("asc我是");
        //换行
        bw.newLine();
        //c.public void write(char[] buffer)//写一个字符数组出去
        char[] chars = "asc我是".toCharArray();
        bw.write(chars);
        //换行
        bw.newLine();
        //d.public void write(String c,int pos,int len):写字符串的一部分出去
        bw.write("abc我是",0,3);
        //e.public void write(char[] buffer,int pos,int len):写字符数组的一部分出去
        bw.write(chars,3,2);
        //换行
        bw.newLine();

        // fw.flush(); //写数据必须，刷新数据  可以继续使用流
        bw.close();//释放资源 包含了刷新的 关闭后流不可以使用了

    }
}
