package io.delightedqian.d1_set;

/**
 * Project Name: SetDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/12
 * TIME:  17:22
 */
public class SetDemo02 {
    public static void main(String[] args) {
        String name = "itheima";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());
        System.out.println("-----------");
        String name1 = "itheima";
        System.out.println(name1.hashCode());
        System.out.println("------------");
        String name2 = "itheima2";
        System.out.println(name2.hashCode());
    }
}
