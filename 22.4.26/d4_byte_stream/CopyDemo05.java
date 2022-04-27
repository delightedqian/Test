package io.delightedqian.d4_byte_stream;

import java.io.*;

/**
 * Project Name: CopyDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  9:40
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
            //创建一个字节输入流管道与原视频接通
            InputStream is = new FileInputStream("file-io-app\\src\\out04.txt");

            //创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("file-io-app\\src\\out05.txt");

            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len ; //记录每次读取的字节数
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
            //关闭流
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
