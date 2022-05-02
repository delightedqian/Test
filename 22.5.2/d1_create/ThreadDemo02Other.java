package io.delightedqian.d1_create;

/**
 * Project Name: ThreadDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/1
 * TIME:  16:18
 */
public class ThreadDemo02Other {
    public static void main(String[] args) {
        //3 创建一个任务对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1执行输出" + i);
                }
            }
        };
        //4 把任务对象交给Thread处理
        Thread t = new Thread(target);
        //5 启动线程
        t.start();

        //简化1
        //3 创建一个任务对象

        //4 把任务对象交给Thread处理

        //5 启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2执行输出" + i);
                }
            }
        }).start();
        //简化2
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程3执行输出" + i);
            }
        }
        ).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}


