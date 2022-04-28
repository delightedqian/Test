package io.delightedqian.d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Project Name: BuffereReaderDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/28
 * TIME:  19:37
 */
public class BuffereReaderDemo01 {
    public static void main(String[] args) {
        try(
                //1创建一个文件字符输入流与源文件接通
                Reader fr  = new FileReader("io-app2\\src\\data01");
                BufferedReader br = new BufferedReader(fr);
        ) {

            //2用循环 每次读取一个字符数组的数据
//            char[] buffer = new char[1024];//此处不是1kb，是1024个字符
//            int len;
//            while((len=br.read(buffer))!=-1){
//                String rs = new String(buffer,0,len);
//                System.out.println(rs);
//            }
            String line ;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
