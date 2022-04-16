package io.delightedqian.d9_map_impl;

import java.util.*;

/**
 * Project Name: MapTest02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/16
 * TIME:  15:52
 */
public class MapTest02 {
    public static void main(String[] args) {
               Map<String, List<String>> maps = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"A","B");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"A","B","C");
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"A","B","C","D");

        maps.put("张三",list1);
        maps.put("李四",list2);
        maps.put("王五",list3);

        System.out.println(maps);

        //记录投票的结果
        Map<String,Integer> maps1 =new HashMap<>();

        //用集合接收全部投票的结果
        Collection<List<String>> collection = maps.values();
        System.out.println(collection);

        for (List<String> list : collection) {
            for (String s : list) {
                if(maps1.containsKey(s)){
                    maps1.put(s,maps1.get(s)+1);
                }else{
                    maps1.put(s,1);
                }
            }
        }
        System.out.println(maps1);
    }
}
