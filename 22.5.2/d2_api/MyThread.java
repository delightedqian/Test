package io.delightedqian.d2_api;

/**
 * Project Name: MyThread
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/2
 * TIME:  18:51
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出");
        }
    }
}
