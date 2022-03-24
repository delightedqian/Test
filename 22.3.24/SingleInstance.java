package io.delightedqian.d4_static_singleinstance;

/**
 * Project Name: SingleInstance
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  15:10
 */
public class SingleInstance {

    public static SingleInstance instance = new SingleInstance();
//    public static int age = 21;

    private SingleInstance(){
    }
}
