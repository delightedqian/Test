package io.delightedqian.d8_innerclass_anonymous;

/**
 * Project Name: Test02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/31
 * TIME:  16:54
 */
public class Test02 {
    public static void main(String[] args) {

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        });
    }

    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

interface Swimming {
    void swim();
}
