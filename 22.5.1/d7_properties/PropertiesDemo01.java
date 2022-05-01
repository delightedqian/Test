package io.delightedqian.d7_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Project Name: PropertiesDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/1
 * TIME:  10:35
 */
public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("itcast","123456");
        properties.setProperty("chen","123456");
        System.out.println(properties);
        /*
        * 参数一 保存管道 字符输出管道
        * 参数二 保存心得
        * */
        properties.store(new FileWriter("io-app2/src/users.properties"),"good");
    }
}
