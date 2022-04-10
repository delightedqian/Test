package io.delightedqian.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Project Name: CollectionDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/10
 * TIME:  14:51
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("周超");
        System.out.println(list);
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });


        //简化后
        list.forEach(s -> {
            System.out.println(s);
        });

    }
}
