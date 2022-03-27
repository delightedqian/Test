package io.delightedqian.d7_abstract_test;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  10:07
 */
public class Test {
    public static void main(String[] args) {
        GoldCard c =new GoldCard();
        c.setMoney(10000);

        c.pay(300);
        System.out.println("剩余"+c.getMoney());
    }


}
