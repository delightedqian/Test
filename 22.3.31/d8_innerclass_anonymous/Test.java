package io.delightedqian.d8_innerclass_anonymous;


/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/29
 * TIME:  19:44
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快");
            }
        } ;

        a.run();
    }
}


//class Tiger extends Animal {
//    @Override
//    public void run() {
//        System.out.println("老虎跑得快 ");
//    }
//}
abstract class Animal {
    public abstract void run();
}
