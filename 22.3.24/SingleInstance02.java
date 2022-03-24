package io.delightedqian.d4_static_singleinstance;

/**
 * Project Name: SingleInstance02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/24
 * TIME:  15:29
 */
public class SingleInstance02 {
//    私有化，这样防止给别人挖坑，别人再通过SingleInstance.instance就不行，只能通过调用
//    getInstance
    private static SingleInstance02 instance;
//提供一个方法，对外返回单例对象
    public static SingleInstance02 getInstance() {
//        第一次取对象，如果为空，就创建，不为空，就return
        if (instance == null) {
            instance = new SingleInstance02();
        }
        return instance;
    }
//私有化
    private SingleInstance02() {
    }

}
