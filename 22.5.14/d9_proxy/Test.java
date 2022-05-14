package io.delightedqian.d9_proxy;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/13
 * TIME:  19:48
 */
public class Test {
    public static void main(String[] args) {
        Star s = new Star("杨超越");
        Skill s2 = StarAgentProxy.getProxy(s);
        s2.dance();
        s2.sing();
    }
}
