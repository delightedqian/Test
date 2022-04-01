package io.delightedqian.d10_api_objects;

import java.util.Objects;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/1
 * TIME:  10:45
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "itheima";
//        System.out.println(s1.equals(s2));
//        System.out.println(Objects.equals(s1,s2));

//        String s1 = null;
        System.out.println(Objects.isNull(s1));
        System.out.println(s1==null);

    }
}
