package io.delightedqian.d5_reflect_method;

/**
 * Project Name: Dog
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/12
 * TIME:  18:16
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }
    public void run(){
        System.out.println("狗跑的贼快");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
    private String eat(String name){
        System.out.println("够吃"+name);
        return "吃的很开心";
    }
    public static void inAddr(){
        System.out.println("在黑马学习Java");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
