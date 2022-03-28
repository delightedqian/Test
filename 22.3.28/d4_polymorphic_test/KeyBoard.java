package io.delightedqian.d4_polymorphic_test;

/**
 * Project Name: KeyBoard
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  19:57
 */
public class KeyBoard implements USB {


private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public KeyBoard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"成功连接电脑");
    }
    public void keyDown(){
        System.out.println("来了老弟");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出电脑");

    }
}
