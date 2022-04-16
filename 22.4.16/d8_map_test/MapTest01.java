package io.delightedqian.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Project Name: MapTest01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/16
 * TIME:  14:26
 */
public class MapTest01 {
    public static void main(String[] args) {
        String[] s = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
          sb.append(s[r.nextInt(s.length)]);
        }
        System.out.println(sb);

        Map<Character,Integer> maps = new HashMap<>();
//        for (int i = 0; i <sb.length() ; i++) {
        for (int i = 0; i <sb.length() ; i++) {


            char ch = sb.charAt(i);
            if(maps.containsKey(ch)){
                maps.put(ch,maps.get(ch)+1);
            }else {
                maps.put(ch,1);
            }
        }
        System.out.println(maps);

    }
}
