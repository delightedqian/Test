package io.delightedqian.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project Name: StreamDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/16
 * TIME:  20:36
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists,"张三","张文文","李玟","李四");
        System.out.println(lists);

        List<String> zhangList = new ArrayList<>();
        for (String list : lists) {
            if(list.startsWith("张")){
                zhangList.add(list);
            }
        }
        System.out.println(zhangList);

        List<String> twoZhangList = new ArrayList<>();
        for (String s : zhangList) {
            if(s.length()==3){
                twoZhangList.add(s);
            }
        }
        System.out.println(twoZhangList);
        lists.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }

}
