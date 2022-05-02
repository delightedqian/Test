package io.delightedqian.d1_create;

/**
 * Project Name: ThreadDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/1
 * TIME:  14:45
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //3 new 一个新线程对象
        Thread t = new MyThread();
        //4 调用start（）方法启动线程（执行的还是run方法）
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }

    }
}

//1 定义一个线程类继承Thread
class MyThread extends Thread {
    // 2重写run（）方法 里面是定义线程以后要干啥
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
