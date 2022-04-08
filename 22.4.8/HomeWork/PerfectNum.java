package io.delightedqian.HomeWork;

/**
 * Project Name: PerfectNum
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  18:15
 */
public class PerfectNum {
    //    public static void PerfectNum(){
//        for(int i=2;i<=200;i++){
//            int sum=1;
//            for(int j=2;j<=i/2;j++){
//                if(i%j==0){
//                    sum+=i;
//                }
//            }
//            if(sum==i){
//                System.out.print(i+"、");
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        //调用方法
//        PerfectNum();
//    }
//}
    public static void PerfectNum(){
        for(int i=2;i<200;i++){
            int sum=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.print(i+"、");

            }
        }
    }


    public static void main(String[] args) {
        //调用方法
        PerfectNum();
    }
}