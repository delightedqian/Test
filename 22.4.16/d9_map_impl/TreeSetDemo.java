package io.delightedqian.d9_map_impl;

import io.delightedqian.d1_set.Apple;

import java.util.*;

/**
 * Project Name: TreeSetDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/16
 * TIME:  15:20
 */
public class TreeSetDemo {
    public static void main(String[] args) {
      Map<Apple,String> apples = new TreeMap<>(new Comparator<Apple>() {
          @Override
          public int compare(Apple o1, Apple o2) {
              return o1.getWeight()-o2.getWeight();
          }
      }) ;

        apples.put(new Apple("红富士","红色",4.9,300),"山东");
        apples.put(new Apple("青苹果","绿色",8.9,500),"广州");
        apples.put(new Apple("绿苹果","青色",5.9,600),"贵州");
        apples.put(new Apple("黄苹果","红色",9,500),"湖北");
        System.out.println(apples);
    }
}
