package io.delightedqian.d6_thread_synchronized_lock;

/**
 * Project Name: ThreadDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/3
 * TIME:  18:29
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //1 定义一个线程类  创建一个共享的账户对象
        Account acc =new Account("ICBC-111",100000);
        //2 创建小明 和 小红 两个线程对象 表示都进来取钱
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

    }
}
