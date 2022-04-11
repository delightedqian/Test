package io.delightedqian.d11_genercity_limit;

import java.util.ArrayList;

/**
 * Project Name: GenericDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/11
 * TIME:  20:49
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        go(dogs);
    }

    //定义开始比赛
    public static void go(ArrayList<? extends Car> cars) {

    }
}

class BMW extends Car {
}

class BENZ extends Car {
}

//父类
class Car {
}

class Dog {
}

