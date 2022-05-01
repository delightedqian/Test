package io.delightedqian.d5_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Project Name: ObjectOutputStreamDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/30
 * TIME:  16:48
 */
public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //1 创建学生对象
        Student s = new Student("陈","chen","121212",21);
        //2 对象序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));

        //3 直接调用序列化方法
        oos.writeObject(s);
        //4 释放资源
        oos.close();
    }
}
