package io.delightedqian.d2_recusion;

/**
 * Project Name: RecusionDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/25
 * TIME:  9:11
 */
//1-n的和
public class RecusionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(4));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return f(n-1)+n;
        }
    }
}
