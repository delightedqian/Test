package io.delightedqian.d2_api;

/**
 * Project Name: ThreadDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/2
 * TIME:  19:27
 */
public class ThreadDemo03 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <=5 ; i++) {
            System.out.println("输出"+i);
            if(i==3){
                Thread.sleep(3000);
            }
        }
    }
}
