package io.delightedqian.d2_api;

/**
 * Project Name: ThreadDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/2
 * TIME:  18:51
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号");
        t1.start();
        //t1.setName("1号");

        Thread t2 = new MyThread("2号");
        t2.start();
       //t2.setName("2号");

        // 哪个线程执行它，他就得到哪个线程对象
        //主线程的名称就叫main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出");
        }
    }
}
