package io.delightedqian.d8_abstract_attention;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  10:45
 */
public class Test {

}

abstract class Cat extends Animal {
    @Override
    public void eat() {
    }
    @Override
    public void run() {
    }
}
abstract class Animal {
    public abstract void eat();

    public abstract void run();

}