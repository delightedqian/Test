package io.delightedqian.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Project Name: FileReaderDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  19:40
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        //1创建一个文件字符输入流与源文件接通
        Reader fr  = new FileReader("D:file-io-app\\src\\out05.txt");


        //2用循环 每次读取一个字符数组的数据
        char[] buffer = new char[1024];//此处不是1kb，是1024个字符
        int len;
        while((len=fr.read(buffer))!=-1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }

    }
}
