package io.delightedqian.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Project Name: FileInputStreamDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/26
 * TIME:  16:51
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app\\src\\data.txt");

        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char)b);
        }
    }
}
