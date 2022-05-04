package io.delightedqian.d6_thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name: Account
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/3
 * TIME:  18:32
 */
public class Account {
    private String cardId;
    private double money;
    //    获得Lock锁的实现类对象
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
//    public static void run(){
//        synchronized (Account.class){
//
//        }
//    }

    public  void drawMoney(double money) {
        lock.lock();//上锁
        //1 先判断是谁来取钱的
        String name = Thread.currentThread().getName();
        //this == acc 共享账户

        try {
            //2 判断余额
            if(money<=this.money){
                //3取钱
                System.out.println(name+"取钱成功"+money);
                //更新余额
                this.money-=money;
                System.out.println(name+"取钱后剩余"+this.money);
            }else{
                System.out.println("余额不足");
            }
        } finally {
            lock.unlock();//解锁
        }

    }
}
