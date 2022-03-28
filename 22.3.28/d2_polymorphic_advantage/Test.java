package io.delightedqian.d2_polymorphic_advantage;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  18:40
 */
public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
//        a1.run();

        Animal a2 = new Tortoise();

//        Tortoise t = (Tortoise) a2;
//        t.layEggs();

        if(a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2;
        }else if(a2 instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }

    }

    public static void go(Animal a2) {
        if(a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2;
        }else if(a2 instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }

//        System.out.println("开始比赛");
//        a.run();
//        System.out.println("结束比赛");
    }
}
