package io.delightedqian.d8_threadpool;

/**
 * Project Name: MyRunnable
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  16:12
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了--->" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "正在睡眠");
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
