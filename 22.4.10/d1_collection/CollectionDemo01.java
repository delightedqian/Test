package io.delightedqian.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Project Name: CollectionDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/10
 * TIME:  9:21
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java1");
        list.add("Java");
        list.add("MyBatis");
        list.add(23);
        list.add(23);
        list.add("false");
        list.add("MyBatis");
        System.out.println(list);

        //无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("MyBatis");
        list1.add(23);
        list1.add(23);
        list1.add("false");
        list1.add("MyBatis");
        System.out.println(list1);
        System.out.println("-------------");
        Collection<String> list2 = new ArrayList<>();//1.7之后可以省略后面间括号中的类型
        list2.add("j2321");
        list2.add("zhangsan");
        Collection<Integer> list3= new ArrayList<>();
        list3.add(45);
        list3.add(12);
    }
}
