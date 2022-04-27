package io.delightedqian.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Project Name: FileReaderDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/27
 * TIME:  19:26
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("D:file-io-app\\src\\out05.txt");
        int code;
        while((code = fr.read())!=-1){
            System.out.print((char)code);
        }
    }
}
