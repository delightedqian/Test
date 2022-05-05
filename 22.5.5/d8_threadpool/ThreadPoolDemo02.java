package io.delightedqian.d8_threadpool;

import java.util.concurrent.*;

/**
 * Project Name: ThreadPoolDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/5
 * TIME:  16:12
 */
public class ThreadPoolDemo02 {
    public static void main(String[] args) throws Exception {
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
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(500));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

    }
}
