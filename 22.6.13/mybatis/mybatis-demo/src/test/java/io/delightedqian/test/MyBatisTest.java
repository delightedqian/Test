package io.delightedqian.test;

import io.delightedqian.mapper.BrandMapper;
import io.delightedqian.mapper.UserMapper;
import io.delightedqian.pojo.Brand;
import io.delightedqian.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Project Name: MyBatisTest
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/11
 * TIME:  9:35
 */
public class MyBatisTest {

    /**
     * 查询所有
     */
    @Test
    public void testselectALL() throws Exception {
        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
//      4  释放资源
        sqlSession.close();


    }

    /**
     * 查询详情
     */
    @Test
    public void testselectById() throws Exception {
        int id = 1;
        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);
//      4  释放资源
        sqlSession.close();


    }

    /**
     * 多条件查询
     */
    @Test
    public void testselectByCondition() throws Exception {
//      接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        Map map = new HashMap();
        // map.put("status",status);
        map.put("companyName", companyName);
        //map.put("brandName",brandName);

        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);
//      4  释放资源
        sqlSession.close();


    }

    /**
     * 单条件查询 之 动态条件查询
     */
    @Test
    public void testselectByConditionSingle() throws Exception {
//      接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        // brand.setStatus(status);
        //brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);

        System.out.println(brands);
//      4  释放资源
        sqlSession.close();
    }

    /**
     * 添加
     */
    @Test
    public void testAdd() throws Exception {
//      接收参数
        int status = 1;
        String companyName = "HONOR";
        String brandName = "HONOR";
        int ordered = 100;
        String description = "就是牛";

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);

//      4  释放资源
        sqlSession.close();
    }
    /**
     * 修改
     */
    @Test
    public void testUpdate() throws Exception {
//      接收参数
        int status = 0;
        String companyName = "华为集团";
        String brandName = "HONOR";
        int ordered = 100;
        String description = "就是牛";
        int id=5;
        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setOrdered(ordered);
//        brand.setDescription(description);
          brand.setId(id);

        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int update = brandMapper.update(brand);
        System.out.println(update);


//      4  释放资源
        sqlSession.close();
    }

    /**
     * 删除  根据id
     */
    @Test
    public void testDeleteById() throws Exception {
//      接收参数

        int id=5;


        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteById(id);

//      4  释放资源
        sqlSession.close();
    }

    /**
     * 批量删除
     */
    @Test
    public void testDeleteByIds() throws Exception {
//      接收参数

        int[] ids={4,6};


        //      1  获取  SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//      2  获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      3  获取UserMapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteByIds(ids);

//      4  释放资源
        sqlSession.close();
    }
}
