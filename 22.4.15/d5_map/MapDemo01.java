package io.delightedqian.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Project Name: MapDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/15
 * TIME:  12:40
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //Map<String,Integer> maps = new HashMap<>();
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("鸿星尔克",3);
        maps.put("枸杞",100);
        maps.put("Java",1);
        maps.put("Java",110);
        maps.put(null,null);
        System.out.println(maps);
    }
}
