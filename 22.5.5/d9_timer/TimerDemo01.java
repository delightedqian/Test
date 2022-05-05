package io.delightedqian.d9_timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Project Name: TimerDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  19:31
 */
public class TimerDemo01 {
    public static void main(String[] args) {
        // 创建Timer定时器
        Timer timer = new Timer();
        // 调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次");
            }
        },3000,2000);
    }
}
