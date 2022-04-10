package io.delightedqian.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Project Name: CollectionDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/10
 * TIME:  12:10
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("周超");
        System.out.println(list);

        for(String ele:list){
            System.out.println(ele);
        }

        //Iterator<String> it = list.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //上面的直接写成下面循环
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
