package io.delightedqian.HomeWork;

/**
 * Project Name: ChangeStu
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  19:21
 */
public class ChangeStu {
    public static void main(String[] args) {
        int i,j,k;
        //i,j,k分别为5、10、20元零钱的数量；
        for(i=0;i<=20;i++){
            for(j=0;j<=10;j++){
                for(k=0;k<=5;k++){
                    if(i*5+j*10+k*20==100){
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }


    }
}
