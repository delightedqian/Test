package io.delightedqian.d4_transfer_stream;

import java.io.*;

/**
 * Project Name: OutputStreamReaderDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/29
 * TIME:  19:11
 */
public class OutputStreamReaderDemo02 {
    public static void main(String[] args) throws Exception {
        //1 定义一个字节输出流
        OutputStream os = new FileOutputStream("io-app2/src/out02.txt");
        //2 把原始的字节输出流转换成字符输出流
        Writer osw = new OutputStreamWriter(os,"UTF-8");

        //3 把低级的字符输出流包装成高级的缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我爱中国");

        bw.close();
        osw.close();
    }
}
