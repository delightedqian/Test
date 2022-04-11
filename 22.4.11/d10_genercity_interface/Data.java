package io.delightedqian.d10_genercity_interface;

/**
 * Project Name: Data
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/11
 * TIME:  20:27
 */
public interface Data<E> {
    //以后给的是对象
    void add(E e);
    //传入的是int
    void delete(int id);
    void update(E e);
     E queryById(int id);
}
