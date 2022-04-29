package io.delightedqian.d4_transfer_stream;

import java.io.*;
import java.nio.Buffer;

/**
 * Project Name: InputStreamReaderDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/29
 * TIME:  18:33
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception {
        //1 提取GBK文件的原始字节流
        InputStream is = new FileInputStream("D:\\My_ok？\\Java数据\\data.txt");
        //2 把原始字节流转换成字符输入流
        Reader isr = new InputStreamReader(is,"GBK");
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
