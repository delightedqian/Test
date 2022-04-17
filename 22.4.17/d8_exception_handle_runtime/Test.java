package io.delightedqian.d8_exception_handle_runtime;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  20:29
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            chu(3, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }

    public static void chu(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }
}
