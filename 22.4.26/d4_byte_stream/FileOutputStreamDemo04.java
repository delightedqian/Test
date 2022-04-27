package io.delightedqian.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Project Name: FileOutputStreamDemo04
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  9:09
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        //此处写的目录名不需要先创建，因为会自动帮你创建
        //a.public void write(int a) : 写一个字节出去
        OutputStream os = new FileOutputStream("file-io-app\\src\\out04.txt",true);
        os.write('a');
        os.write('b');

        //b.public void write(byte [] buffer):写一个字节数组出去
        byte[] buffer = {'a',97,98,99};
        os.write(buffer);

        //写入汉字   需要将汉字转换成字节
        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);

        //c.public void write(byte[] buffer,int pos,int len) : 写一个字节数组的一部分出去
        byte[] buffer3 = {'a',97,98,99};
        os.write(buffer3,0,3);

        // os.flush(); //写数据必须，刷新数据  可以继续使用流
        os.close();//释放资源 包含了刷新的 关闭后流不可以使用了
    }
}
