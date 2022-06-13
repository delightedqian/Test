package io.delightedqian;

import io.delightedqian.mapper.UserMapper;
import io.delightedqian.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Project Name: MyBatisDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/5
 * TIME:  10:40
 */
public class MyBatisDemo02 {

    public static void main(String[] args) throws Exception {

//      1  获取  SqlSessionFactory 对象
        String resource = "myba" +
                "tis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
////      3   执行sql
//        List<User> lists = sqlSession.selectList("test.selectAll");
//        System.out.println(lists);
//        3.1 获取UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);

//      4   释放资源
        sqlSession.close();
    }
}
