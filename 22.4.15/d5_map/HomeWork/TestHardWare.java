package io.delightedqian.d5_map.HomeWork;

/**
 * Project Name: TestHardWare
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/15
 * TIME:  16:27
 */
public class TestHardWare {
    public static void test(HardWare h){
        h.print(1);
    }
    public static void main(String[] args) {
        test(new Keyboard());
        test(new Monitor());
    }
}
