package io.delightedqian.mapper;

import io.delightedqian.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select *from tb_brand2")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     */
    @Insert("insert into tb_brand2 values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @Select("select *from tb_brand2 where id =#{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    /**
     * 修改数据
     * @param brand
     */
    @Update("update tb_brand2 set brand_name=#{brandName},company_name=#{companyName}," +
            "ordered=#{ordered},description=#{description},status=#{status} where id=#{id}")
    void update(Brand brand);

    /**
     * 删除数据
     * @param id
     */
    @Delete("delete from tb_brand2 where id=${id}")
    void delete(int id);
}
