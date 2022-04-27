package io.delightedqian.d6_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Project Name: FileReaderDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  20:14
 */
public class FileReaderDemo03 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("file-io-app\\src\\out06.txt");
        //a.public void write(int c):写一个字符出去
        fw.write(98);
        fw.write('a');
        fw.write('序');
        //b.public void write(String c)写一个字符串出去
        fw.write("asc我是");
        //c.public void write(char[] buffer)//写一个字符数组出去
        char[] chars = "asc我是".toCharArray();
        fw.write(chars);
        //d.public void write(String c,int pos,int len):写字符串的一部分出去
        fw.write("abc我是",0,3);
        //e.public void write(char[] buffer,int pos,int len):写字符数组的一部分出去
        fw.write(chars,3,2);

        // fw.flush(); //写数据必须，刷新数据  可以继续使用流
        fw.close();//释放资源 包含了刷新的 关闭后流不可以使用了

    }
}
