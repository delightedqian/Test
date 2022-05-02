package io.delightedqian.d1_create;

/**
 * Project Name: ThreadDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/1
 * TIME:  16:18
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //3 创建一个任务对象
        Runnable target = new MyRunnable();
        //4 把任务对象交给Thread处理
        Thread t = new Thread(target);
        //5 启动线程
        t.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程执行输出"+i);
        }
    }
}
//1 定义一个线程任务类  实现Runnable接口
class MyRunnable implements Runnable{
//2 重写run方法，定义线程的执行任务

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出"+i);
        }
    }
}
