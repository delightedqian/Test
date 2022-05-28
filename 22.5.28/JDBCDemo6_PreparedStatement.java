package io.delightedqian.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * Project Name: JDBCDemo1
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/22
 * TIME:  15:44
 */
public class JDBCDemo6_PreparedStatement {
    @Test
    public void testPreparedStatement() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql:///test?useSSL=false";
        String username="root";
        String password="123123";
        Connection coon = DriverManager.getConnection(url,username,password);

        String name = "zhangsan";
        String pwd = "123";

        String sql = "select * from tb_user where username=? and password=?";
        PreparedStatement pstmt = coon.prepareStatement(sql);
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);
        ResultSet rs = pstmt.executeQuery();
//        不用PreparedStatement写法
//        Statement stmt = coon.createStatement();
//        String sql = "select * from tb_user where username ='"+name+"' and password ='"+pwd+"'";
//        ResultSet rs = stmt.executeQuery(sql);

        if(rs.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }


        // 7 释放资源
        rs.close();
        pstmt.close();
        coon.close();

    }
}

