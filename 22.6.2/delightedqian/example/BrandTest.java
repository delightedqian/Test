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
}
