package io.delightedqian.d2_polymorphic_advantage;

/**
 * Project Name: Tortoise
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  18:38
 */
public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("乌龟跑的贼慢");
    }
    public void layEggs(){
        System.out.println("乌龟下蛋");
    }
}
