package io.delightedqian.d5_serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Project Name: ObjectInputStreamDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/30
 * TIME:  18:45
 */
public class ObjectInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        //1 创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("io-app2/src/obj.txt"));

        //2 调用对象字节输入流的反序列化方法
        Student s = (Student) is.readObject();

        System.out.println(s);
    }
}
