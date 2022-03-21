package io.delightedqian.d3_static_code;

/**
 * Project Name: StaticDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/21
 * TIME:  18:24
 */
public class StaticDemo01 {
    public StaticDemo01(){
        System.out.println("无参构造器被执行");
    }

    {
        System.out.println("实例代码块被执行");
    }


    public static void main(String[] args) {
        StaticDemo01 st = new StaticDemo01();
    }
}
