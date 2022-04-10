package io.delightedqian.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Project Name: CollectionDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/10
 * TIME:  10:45
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("wangwu");
        list.add("黑马");
        list.add("123");

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
