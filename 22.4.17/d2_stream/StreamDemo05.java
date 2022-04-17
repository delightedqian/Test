package io.delightedqian.d2_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project Name: StreamDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  10:56
 */
public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("张三丰");
        lists.add("张三丰");
        lists.add("王五");
        lists.add("李四");
        lists.add("张之");
        lists.add("张六文");
        lists.add("张七文");

        //收集到List集合
        Stream<String> zhangList=lists.stream().filter(s -> s.startsWith("张"));
        List<String> s1 = zhangList.collect(Collectors.toList());
        System.out.println(s1);

        //收集到Set集合
        Stream<String> zhangSet=lists.stream().filter(s -> s.startsWith("张"));
        Set<String> s2 = zhangSet.collect(Collectors.toSet());
        System.out.println(s2);

        //收集到数组
        Stream<String> zhangArrays = lists.stream().filter(s -> s.startsWith("张"));
        Object[] arr = zhangArrays.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
