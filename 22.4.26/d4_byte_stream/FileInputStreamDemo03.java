package io.delightedqian.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Project Name: FileInputStreamDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/26
 * TIME:  18:37
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        File f =new File("file-io-app\\src\\data03");
        InputStream is = new FileInputStream(f);

        byte[] buffer = new byte[(int)f.length()];
        int len = is.read(buffer);
        System.out.println("读取了多少字节"+len);

        System.out.println(new String(buffer));

    }
}
