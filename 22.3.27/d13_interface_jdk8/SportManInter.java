package io.delightedqian.d13_interface_jdk8;

import io.delightedqian.d12_interface_extends.SportMan;

public interface SportManInter {

    default void run() {
//        go();
        System.out.println("跑的贼快");
    }
    static void inAddr(){
        System.out.println("新增Java语法");
    }
//    private void go(){
//        System.out.println("开始跑");
//    }
}

class PingPangMan implements SportManInter {
}

class Test {
    public static void main(String[] args) {
        PingPangMan p = new PingPangMan();
        p.run();

        SportManInter.inAddr();

    }
}