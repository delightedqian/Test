package io.delightedqian.d8_threadpool;

import java.util.concurrent.*;

/**
 * Project Name: ThreadPoolDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  16:12
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
//        1创建线程池对象
   /*
     int corePoolSize,
     int maximumPoolSize,
     long keepAliveTime,
     TimeUnit unit,
     BlockingQueue<Runnable> workQueue,
     ThreadFactory threadFactory,
     RejectedExecutionHandler handler*/
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
//        2 给任务线程池处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
//        等待5个 已经满了
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
//      此时才会创建临时线程
        pool.execute(target);
        pool.execute(target);
//      不会创建线程  已经达到最大
//        pool.execute(target);
//        关闭线程池 一般不会用
        pool.shutdownNow();


    }
}
