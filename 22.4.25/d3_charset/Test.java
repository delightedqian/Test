package io.delightedqian.d3_charset;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/25
 * TIME:  20:49
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String name = "abc我爱你中国";
        //1 编码：把文字转换成字节
        //byte[] bytes = name.getBytes();//以当前代码默认字符集进行编码  此处默认utf-8
        byte[] bytes = name.getBytes("GBK");//指定编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        //2 解码  把字节转换成对应的中文形式（编码前后的字符集必须一致，否则乱码）
        //String rs = new String(bytes);//默认utf-8
        String rs = new String(bytes, "GBK");
        System.out.println(rs);
    }
}
