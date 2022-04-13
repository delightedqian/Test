package io.delightedqian.d1_set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Project Name: SetDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/12
 * TIME:  17:11
 */
public class SetDemo04 {
    public static void main(String[] args) {
      //  Set<String> sets = new HashSet<>();
        Set<String> sets = new LinkedHashSet<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("MySQL");
        sets.add("MySQL");

        System.out.println(sets);
    }
}
