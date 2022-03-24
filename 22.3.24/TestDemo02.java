package io.delightedqian.d4_static_singleinstance;

/**
 * Project Name: TestDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  15:28
 */
public class TestDemo02 {
    public static void main(String[] args) {
        SingleInstance02 s1 = SingleInstance02.getInstance();
        SingleInstance02 s2 = SingleInstance02.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
