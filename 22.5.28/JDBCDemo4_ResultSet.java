package io.delightedqian.jdbc;

import io.delightedqian.pojo.Account;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Name: JDBCDemo1
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/22
 * TIME:  15:44
 */
public class JDBCDemo4_ResultSet {
    @Test
    public void testResultSet() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql:///test?useSSL=false";
        String username="root";
        String password="123123";
        Connection coon = DriverManager.getConnection(url,username,password);
        Statement stmt = coon.createStatement();
        String sql = "select * from account";
        ResultSet rs = stmt.executeQuery(sql);

        List<Account> list = new ArrayList<>();
        while (rs.next()){
            Account account= new Account();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            account.setId(id);
            account.setName(name);
            account.setMoney(money);
            list.add(account);
        }
//        7 释放资源
        rs.close();
        stmt.close();
        coon.close();
        System.out.println(list);
    }



    public static void main1(String[] args) throws Exception {
//        1 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        2 获取连接 test是数据库名称
//        String url="jdbc:mysql://127.0.0.1:3306/test";
        String url="jdbc:mysql:///test?useSSL=false";
        String username="root";
        String password="123123";
        Connection coon = DriverManager.getConnection(url,username,password);
//        3 定义SQL语句
        String sql="select * from account";
//        4 获取执行对象
        Statement stmt=coon.createStatement();
//        5 执行SQL
          ResultSet rs  =stmt.executeQuery(sql);
//        6 处理返回结果
          while (rs.next()){
//              int id = rs.getInt(1);
//              String name = rs.getString(2);
//              double money = rs.getDouble(3);
              int id = rs.getInt("id");
              String name = rs.getString("name");
              double money = rs.getDouble("money");
              System.out.println(id);
              System.out.println(name);
              System.out.println(money);
              System.out.println("---------------");
          }
//        7 释放资源
        rs.close();
        stmt.close();
        coon.close();
    }
}
