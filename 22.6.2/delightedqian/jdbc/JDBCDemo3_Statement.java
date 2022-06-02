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
public class JDBCDemo3_Statement {
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
        String sql="UPDATE account SET money=2000 WHERE id=5";
//        4 获取执行对象
        Statement stmt=coon.createStatement();
//        5 执行SQL
        int count=stmt.executeUpdate(sql);
//        6 处理返回结果
//        System.out.println(count);
        if(count>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
//        7 释放资源
        stmt.close();
        coon.close();
    }
}
