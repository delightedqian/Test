package io.delightedqian.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project Name: JDBCDemo1
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/22
 * TIME:  15:44
 */
public class JDBCDemo2_Connection {
    public static void main(String[] args) throws Exception {
//        1 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        2 获取连接 test是数据库名称
//        String url="jdbc:mysql://127.0.0.1:3306/test";
        String url="jdbc:mysql:///test?useSSL=false";
        String username="root";
        String password="123123";
        Connection coon = DriverManager.getConnection(url,username,password);
//        3 定义SQL语句
        String sql1="UPDATE account SET money=2000 WHERE id=1";
        String sql2="UPDATE account SET money=3000 WHERE id=2";
//        4 获取执行对象
        Statement stmt=coon.createStatement();

        try {
//        开启事务
            coon.setAutoCommit(false);
//        5 执行SQL
            int count1=stmt.executeUpdate(sql1);
//        6 处理返回结果
            System.out.println(count1);
//        5 执行SQL
            int count2=stmt.executeUpdate(sql2);
//        6 处理返回结果
            System.out.println(count2);
//            提交事务
            coon.commit();
        } catch (Exception e) {
//            回滚事务
            coon.rollback();
            e.printStackTrace();
        }

//        7 释放资源
        stmt.close();
        coon.close();
    }
}
