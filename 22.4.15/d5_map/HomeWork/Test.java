package io.delightedqian.d5_map.HomeWork;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/15
 * TIME:  19:08
 */
abstract class Aniaml{
    abstract void run();
}
class Cat extends Aniaml{
    @Override
    void run() {
        System.out.println("猫跑的也快");
    }
    void shout(){
        System.out.println("猫会叫");
    }

}
class Dog extends Aniaml{

    @Override
    void run() {
        System.out.println("狗跑的快");
    }
    void shout(){
        System.out.println("狗会叫");
    }
}

public class Test {
    public static void main(String[] args) {
        Aniaml a = new Dog();
        Dog d = (Dog) a;
        //shout(a);
        Aniaml a1 = new Cat();
        shout(a1);
    }
    public static void shout(Aniaml a){
         if(a instanceof Cat){
             Cat c = (Cat) a;
             c.shout();
         }else if(a instanceof Dog){
             Dog d = (Dog) a;
             d.shout();
         }
    }
}
