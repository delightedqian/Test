package io.delightedqian.d6_regex;

/**
 * Project Name: RegexDemo04
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/6
 * TIME:  8:39
 */
public class RegexDemo04 {
    public static void main(String[] args) {
        String names = "小路hkjh小王jkhkj蓉儿";

        String [] arrs = names.split("\\w+");
        for (int i = 0; i <arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String name2 = names.replaceAll("\\w+"," ");
        System.out.println(name2);
    }
}
