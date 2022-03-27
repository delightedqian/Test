package io.delightedqian.d9_abstract_template;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  15:39
 */
public class Test {
    public static void main(String[] args) {
        StudentMiddle s1 = new StudentMiddle();
        s1.write();
        StudentChild s2 = new StudentChild();
        s2.write();
    }
}
