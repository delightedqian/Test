package io.delightedqian.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import io.delightedqian.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Project Name: BrandTest
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/2
 * TIME:  16:37
 */
public class BrandTest {
    /**
     *
     * 查询
     * SQL语句：select* from tb_brand;
     * 参数：不需要
     * 结果：List<Brand>
     */
    @Test
    public void testSelectAll() throws Exception {
//       1 获取连接

//       加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\druid.properties"));
//      获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//      获取连接
        Connection coon = dataSource.getConnection();
//       2定义sql语句
        String sql = "select * from tb_brand";
//       3获取PrepareStatement对象
        PreparedStatement pstmt = coon.prepareStatement(sql);
//       4 赋值  本案例不需要
//       5 执行
        ResultSet rs = pstmt.executeQuery();
//       6 处理结果
        Brand brand = null;
        List<Brand> list = new ArrayList<>();
        while (rs.next()){
//           取值
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
//          封装成Brand
            brand=new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
//           添加到集合
            list.add(brand);

        }
        System.out.println(list);

//       7 释放资源
        rs.close();
        pstmt.close();
        coon.close();
    }
    /**
     *
     * 增加
     * SQL语句：insert into tb_brand(brand_name,company_name,ordered,description,status) values(?,?,?,?,?);
     * 参数：需要 除了id之外  因为id是自动增长类型
     * 结果：boolean
     */
    @Test
    public void testAdd() throws Exception {
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String  description= "一年卖出一亿杯";
        int status=1;
//       1 获取连接

//       加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\druid.properties"));
//      获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//      获取连接
        Connection coon = dataSource.getConnection();
//       2定义sql语句
        String sql = "insert into tb_brand(brand_name,company_name,ordered,description,status) values(?,?,?,?,?);";
//       3获取PrepareStatement对象
        PreparedStatement pstmt = coon.prepareStatement(sql);
//       4 赋值
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
//       5 执行
        int count = pstmt.executeUpdate();
        System.out.println(count>0);

//       7 释放资源
        pstmt.close();
        coon.close();
    }
    /**
     *
     * 改
     * SQL语句：update tb_brand set brand_name=?,
     *                             company_name=?,
     *                             ordered=?,
     *                             description=?,
     *                             status=?
     *                        where id=?;
     *
     * 参数：全部需要
     * 结果：boolean
     */
    @Test
    public void testUpdate() throws Exception {
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String  description= "一年卖出三亿杯";
        int status=1;
        int id=4;
//       1 获取连接

//       加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\druid.properties"));
//      获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//      获取连接
        Connection coon = dataSource.getConnection();
//       2定义sql语句
        String sql = "update tb_brand set brand_name=?,\n" +
                "                      company_name=?,\n" +
                "                      ordered=?,\n" +
                "                      description=?,\n" +
                "                      status=?\n" +
                "                 where id=?;";
//       3获取PrepareStatement对象
        PreparedStatement pstmt = coon.prepareStatement(sql);
//       4 赋值
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);
//       5 执行
        int count = pstmt.executeUpdate();
        System.out.println(count>0);

//       7 释放资源
        pstmt.close();
        coon.close();
    }
    /**
     *
     * 改
     * SQL语句：delete from tb_brand where id=?;
     *
     * 参数：全部需要
     * 结果：boolean
     */
    @Test
    public void testDeleteByID() throws Exception {

        int id=4;
//       1 获取连接

//       加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\druid.properties"));
//      获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//      获取连接
        Connection coon = dataSource.getConnection();
//       2定义sql语句
        String sql = "delete from tb_brand where id=?;";
//       3获取PrepareStatement对象
        PreparedStatement pstmt = coon.prepareStatement(sql);
//       4 赋值

        pstmt.setInt(1,id);
//       5 执行
        int count = pstmt.executeUpdate();
        System.out.println(count>0);

//       7 释放资源
        pstmt.close();
        coon.close();
    }
}
