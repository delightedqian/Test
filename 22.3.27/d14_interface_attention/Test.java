package io.delightedqian.d14_interface_attention;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  19:21
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}

interface AAA {
    int eat();
}

interface BBB {
    void run();
}

interface CCC extends AAA, BBB {

}

interface Food {
    default void eat() {
        System.out.println("接口方法的吃");
    }
}

class Animal {
    public void eat() {
        System.out.println("父类动物吃");
    }
}

class Cat extends Animal implements Food {

}


//interface A {
//    static void test() {
//        System.out.println("a");
//    }
//
//    interface B {
//        static void test() {
//            System.out.println("b");
//        }
//    }
//
//    class C implements A, B {
//
//    }