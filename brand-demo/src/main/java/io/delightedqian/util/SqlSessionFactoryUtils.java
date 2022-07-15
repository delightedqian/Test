package io.delightedqian.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project Name: SqlSessionFactoryUtils
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/7/11
 * TIME:  18:02
 */
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
