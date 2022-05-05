package io.delightedqian.d9_timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Project Name: TimerDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  19:31
 */
public class TimerDemo02 {
    public static void main(String[] args) {
        // 创建  ScheduledExecutorService线程池，做定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        // 开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出：AAA");
            }
        },0,2, TimeUnit.SECONDS);
    }
}
