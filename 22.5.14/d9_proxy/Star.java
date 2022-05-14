package io.delightedqian.d9_proxy;

/**
 * Project Name: Star
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/13
 * TIME:  19:45
 */
public class Star implements Skill {
    private String name;
    public Star(String name) {
        this.name = name;
    }
    @Override
    public void dance() {
        System.out.println(name + "开始跳舞");
    }
    @Override
    public void sing() {
        System.out.println(name + "开始唱歌");
    }
}
