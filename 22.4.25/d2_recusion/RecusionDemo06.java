package io.delightedqian.d2_recusion;

/**
 * Project Name: RecusionDemo06
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/25
 * TIME:  19:05
 */
public class RecusionDemo06 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverlNumber;
    public static void main(String[] args) {
        buy(10);
        System.out.println("买的酒" + totalNumber);
        System.out.println("剩余酒瓶" + lastBottleNumber);
        System.out.println("剩余瓶盖" + lastCoverlNumber);
    }
    private static void buy(int money) {
        int buyNumber = money / 2;
        totalNumber += buyNumber;
        int coverNumber = buyNumber + lastCoverlNumber;
        int bottleNumber = buyNumber + lastBottleNumber;
        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverlNumber = coverNumber % 4;
        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;
        if (money >= 2) {
            buy(allMoney);
        }
    }
}
