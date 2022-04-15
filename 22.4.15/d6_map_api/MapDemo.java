package io.delightedqian.d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Project Name: MapDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/15
 * TIME:  21:05
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("Java1",20);
        maps.put("MySQL",35);
        maps.put("Java2",20);
        maps.put("Java1",100);
        maps.put("HUAWEI",50);
        System.out.println(maps);
        //2 清空集合
//        maps.clear();
//        System.out.println(maps);
        //3 判断集合是否为空
        System.out.println(maps.isEmpty());
        //4 根据键值获取对应的值
        System.out.println(maps.get("MySQL"));
        //5 根据键删除整个元素
        maps.remove("Java1");
        System.out.println(maps);
        //6 是否包含某个键
        System.out.println(maps.containsKey("Java1"));
        //7 是否包含某个值
       System.out.println(maps.containsValue(50));
        //8 获取全部键的集合
        Set<String> keys = maps.keySet();
        System.out.println(keys);
        //9 获取全部值的集合
        Collection<Integer>keys1= maps.values();
        System.out.println(keys1);
        //10 获取集合的大小
        System.out.println(maps.size());
        System.out.println("----------");
        Map<String,Integer> maps1 = new HashMap<>();
        maps1.put("Java1",15);
        maps1.put("Java3",150);
        System.out.println(maps1);
        Map<String,Integer> maps2 = new HashMap<>();
        maps2.put("Java2",35);
        maps2.put("Java3",135);
        maps1.putAll(maps2);
        System.out.println(maps2);
        System.out.println(maps1);

    }
}
