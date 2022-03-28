package io.delightedqian.d2_polymorphic_advantage;

/**
 * Project Name: Dog
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  18:38
 */
public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑的贼快");
    }
    public void lookDoor(){
        System.out.println("狗可以看门");
    }
}
