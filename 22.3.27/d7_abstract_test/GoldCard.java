package io.delightedqian.d7_abstract_test;

/**
 * Project Name: GoldCard
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  10:03
 */
public class GoldCard extends Card {
    @Override
    public void pay(double money2) {
        System.out.println("你当前消费"+money2);
        System.out.println("你当前卡片余额"+getMoney());

        double rs = money2*0.8;
        System.out.println("实际支付"+rs);

        setMoney(getMoney()-rs);
    }
}
