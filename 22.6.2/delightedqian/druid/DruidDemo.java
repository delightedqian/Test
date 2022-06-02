package io.delightedqian.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * Project Name: DruidDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/2
 * TIME:  15:56
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {

//      3 加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("jdbc_demo\\src\\druid.properties"));
//      4 获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//      5 获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
