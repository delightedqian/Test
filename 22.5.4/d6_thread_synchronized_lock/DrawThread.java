package io.delightedqian.d6_thread_synchronized_lock;

/**
 * Project Name: DrawThread
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/3
 * TIME:  18:33
 */
public class DrawThread extends Thread {
    //接受处理的账户对象
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;

    }

    @Override
    public void run() {
        //取钱的
        acc.drawMoney(100000);
    }
}
