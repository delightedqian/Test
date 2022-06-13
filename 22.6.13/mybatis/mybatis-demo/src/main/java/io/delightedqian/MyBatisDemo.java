package io.delightedqian;

import io.delightedqian.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Project Name: MyBatisDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/5
 * TIME:  10:40
 */
public class MyBatisDemo {

    public static void main(String[] args) throws Exception {

//      1  获取  SqlSessionFactory 对象
        String resource = "myba" +
                "tis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//      3   执行sql
        List<User> lists = sqlSession.selectList("test.selectAll");
        System.out.println(lists);
//      4   释放资源
        sqlSession.close();
    }
}
