package io.delightedqian.mapper;

import io.delightedqian.pojo.Brand;
import io.delightedqian.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Project Name: UserMapper
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/6/10
 * TIME:  19:11
 */
public interface BrandMapper {
    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查询详情
     */
    Brand selectById(int id);

    /**
     * 多条件查询
     * 参数接收分为下面三种  1散装参数接收  2对象参数  3 map集合参数
     */

    /*List<Brand> selectByCondition(@Param("status") int status,
                                  @Param("companyName") String companyName,
                                  @Param("brandName") String brandName);*/

   /* List<Brand> selectByCondition(Brand brand);*/

    List<Brand> selectByCondition(Map map);

    /**
     *单条件查询 之 动态条件查询
     */
    List<Brand> selectByConditionSingle(Brand brand);

    /**
     * 添加
     */
    void add(Brand brand);

    /**
     * 修改  (包含动态修改)
     */
      int update(Brand brand);

    /**
     * 删除  根据id
     */
    @Delete("delete from tb_brand2 where id=#{id}")
    void deleteById(int id);

    /**
     * 批量删除
     */
    void deleteByIds(int[] id);
}
