package io.delightedqian.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project Name: CollectionsDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/13
 * TIME:  20:33
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists,"java","sdsd","sdsd");
        System.out.println(lists);
        //打乱集合
        Collections.shuffle(lists);
        System.out.println(lists);

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,45,45,65,85,285,45,14,21,2);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
