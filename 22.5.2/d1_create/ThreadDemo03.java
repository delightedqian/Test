package io.delightedqian.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Project Name: ThreadDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/2
 * TIME:  16:03
 */
public class ThreadDemo03 {
    public static void main(String[] args)  {
        //3 创建Callable任务对象
        Callable<String> call = new MyCallable(100);
        //4 把Callable任务对象 交给FutureTask对象
        //FutureTask对象的作用1 是Runnable的对象（实现了Runnable接口），可以交给Thread
        //FutureTask对象的作用2 可以在线程执行完毕后通过调用其get方法得到线程执行完成的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        //5 交给线程处理
        Thread t1 = new Thread(f1);
        //6 启动线程
        t1.start();
        String rs1 = null;
        try {
            rs1 = f1.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("第一个线程的执行结果"+rs1);
    }
}

//1 定义一个任务类  实现Callable接口  应该申明线程任务执行完毕后的数据类型
class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    //2 重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程的执行结果是" + sum;
    }
}