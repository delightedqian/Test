package io.delightedqian.d7_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/**
 * Project Name: PropertiesDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/1
 * TIME:  10:50
 */
public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        System.out.println(properties);

        //加载属性文件的键值对数据到对象properties中去
        properties.load(new FileReader("io-app2/src/users.properties"));

        System.out.println(properties);
        String rs = properties.getProperty("admin");
        System.out.println(rs);
    }
}
