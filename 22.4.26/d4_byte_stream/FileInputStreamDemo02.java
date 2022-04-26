package io.delightedqian.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Project Name: FileInputStreamDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/26
 * TIME:  18:37
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app\\src\\data02");
        //定义一个字节数组，用于读取字节数组
        byte[] buffer = new byte[3];
        int len = is.read(buffer);
        System.out.println("读取了几个字节" + len);
        String rs = new String(buffer);
        System.out.println(rs);


        //定义一个字节数组，用于读取字节数组
//        byte[] buffer = new byte[3];
//        int len;//记录每次读取的字节数
//        while((len = is.read(buffer))!=-1){
//        //读多少 倒多少(那个0表示从第一个，len指读取了几个，读了几个，倒出几个)
//        System.out.print(new String(buffer,0,len));
//        }
    }
}
