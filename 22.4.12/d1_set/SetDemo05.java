package io.delightedqian.d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Project Name: SetDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/13
 * TIME:  18:51
 */
public class SetDemo05 {
    public static void main(String[] args) {
//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight()-o2.getWeight();
//            }
//        });
        Set<Apple> apples = new TreeSet<>() ;

        apples.add(new Apple("红富士","红色",9.9,500));
        apples.add(new Apple("青苹果","绿色",8.9,350));
        apples.add(new Apple("绿苹果","青色",10.9,600));
        apples.add(new Apple("黄苹果","黄色",9,700));
        System.out.println(apples);
    }
}
