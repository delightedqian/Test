package io.delightedqian.d8_threadpool;

import java.util.concurrent.*;

/**
 * Project Name: ThreadPoolDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  16:12
 */
public class ThreadPoolDemo03 {
    public static void main(String[] args) throws Exception {
//        1创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

    }
}
