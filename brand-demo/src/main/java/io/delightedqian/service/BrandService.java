package io.delightedqian.service;

import io.delightedqian.mapper.BrandMapper;
import io.delightedqian.pojo.Brand;
import io.delightedqian.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Project Name: BrandService
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/7/15
 * IME:  9:28
 */
public class BrandService {
    //        获取 SqlSessionFactory对象
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll(){

//        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取BrandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        调用方法
        List<Brand> brands = mapper.selectAll();

//        关闭资源
        sqlSession.close();

        return brands;
    }

    /**
     * 添加数据
     * @param brand
     */

    public void add(Brand brand){
        //        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取BrandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        调用方法
         mapper.add(brand);

//        提交资源
          sqlSession.commit();
          sqlSession.close();
    }

    /**
     * 根据id查询数据
     * @param id
     * @return
     */

    public Brand selectById(int id){
//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取BranMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.close();
        return brand;
    }

    /**
     * 修改数据
     * @param brand
     */
    public void update(Brand brand){
        //        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取BrandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        调用方法
        mapper.update(brand);

//        提交资源
        sqlSession.commit();
        sqlSession.close();
    }

    public void delete(int id){
        //        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取BrandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        调用方法
        mapper.delete(id);

//        提交资源
        sqlSession.commit();
        sqlSession.close();
    }
}
