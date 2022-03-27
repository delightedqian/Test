package io.delightedqian.d11_interface_implements;

import com.sun.deploy.security.ruleset.Rule;

/**
 * Project Name: PingPangMan
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  16:53
 */
public class PingPangMan implements SportMan, Law {
    private String name;

    public PingPangMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name + "遵纪守法");
    }

    @Override
    public void run() {
        System.out.println(name + "训练");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛，为国争光");
    }
}
