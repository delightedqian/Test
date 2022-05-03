package io.delightedqian.d3_thread_safe;

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

    public void drawMoney(double money) {
        //1 先判断是谁来取钱的
        String name = Thread.currentThread().getName();
        //this == acc 共享账户
        synchronized (this) {
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
        }
    }
}
