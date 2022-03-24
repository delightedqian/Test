package io.delightedqian.d4_static_singleinstance;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  15:11
 */
public class TestDemo01 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1==s2);
    }
}
