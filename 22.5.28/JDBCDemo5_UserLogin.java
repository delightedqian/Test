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
public class JDBCDemo5_UserLogin {
    @Test
    public void testUserLogin() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql:///test?useSSL=false";
        String username="root";
        String password="123123";
        Connection coon = DriverManager.getConnection(url,username,password);

        String name = "sdsada";
        String pwd = "'or'1'='1";
        Statement stmt = coon.createStatement();
        String sql = "select * from tb_user where username ='"+name+"' and password ='"+pwd+"'";
        System.out.println(sql);
        ResultSet rs = stmt.executeQuery(sql);
        if(rs!=null){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }


        //        7 释放资源
        rs.close();
        stmt.close();
        coon.close();

    }
}

