package io.delightedqian.d3_collections;

import java.util.*;

/**
 * Project Name: SetDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/13
 * TIME:  18:51
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight()-o2.getWeight();
//            }
//        });
       List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("红富士","红色",9.8,500));
        apples.add(new Apple("青苹果","绿色",8.9,350));
        apples.add(new Apple("绿苹果","青色",10.9,600));
        apples.add(new Apple("黄苹果","黄色",9,700));


        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });

        System.out.println(apples);
    }
}
