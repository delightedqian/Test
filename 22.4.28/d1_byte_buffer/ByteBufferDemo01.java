package io.delightedqian.d1_byte_buffer;

import java.io.*;

/**
 * Project Name: ByteBufferDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/28
 * TIME:  15:24
 */
public class ByteBufferDemo01 {
    public static void main(String[] args) {
        try (
                //这里面只能放置资源对象，用完会自动关闭：自动调用
                // 对象的close方法关闭资源（即使出现异常也会做关闭操作）

                //1创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("file-io-app\\src\\out04.txt");
                //a.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                //2创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("file-io-app\\src\\out05.txt");
                //b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);

        ) {
            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; //记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
