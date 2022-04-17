package io.delightedqian.d2_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Project Name: StreamDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  8:56
 */
public class StreamDemo02 {
    public static void main(String[] args) {
        //Collection集合
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();
        //Map集合
        //键流
        Map<String,Integer> maps = new HashMap<>();
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valuesStream = maps.values().stream();
        //键值流
        Stream<Map.Entry<String,Integer>> keyAndValuesStream=maps.entrySet().stream();

        String [] arr = {"张三","李四"};
        //方法1
        Stream<String> arr1= Arrays.stream(arr);
        //方法2
        Stream<String> arr2 = Stream.of(arr);
    }
}
