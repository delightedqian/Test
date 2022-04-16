package io.delightedqian.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Project Name: MapDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/16
 * TIME:  10:41
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("手表", 30);
        maps.put("电脑", 10);
        maps.put("手机", 25);
        maps.put("鼠标", 50);
//
//        //获取键
//        Set<String> sets = maps.keySet();
//        //遍历键，根据键获取值
//        for (String key : sets) {
//            System.out.println( key+"----->"+maps.get(key));
//        }
        //输入 maps.entrySet(); 点ctrl+alt+v即刻自动生成
        //Set<Map.Entry<String, Integer>> entries = maps.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            String key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println(key+"------>"+value);
//        }

        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k+"------->"+v);
            }
        });
        //简化后
        maps.forEach((String k, Integer v) ->{
            System.out.println(k + "------->" + v);
        });
    }
}
