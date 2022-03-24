package io.delightedqian.d7_extends_field_method;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  18:40
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.lookDoor();
        d.showName();
    }

}

    class Animal {
    public String name="动物名";
    public void run() {
        System.out.println("动物可以跑");
    }

}

class Dog extends Animal {
    public String name="狗名";
    public void lookDoor() {
        System.out.println("狗可以看门");
    }
    public void showName(){
        String name="局部名";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        run();
        this.run();
        super.run();
    }
    public void run(){
        System.out.println("狗跑的快");
    }
}
