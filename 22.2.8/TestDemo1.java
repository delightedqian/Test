import java.util.Scanner;

/**
 * Project Name: TestDemo1
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/2/8
 * TIME:  15:14
 */
public class TestDemo1 {

    public static void fun(int n){

        if(n>9){
            fun(n/10);
        }
        System.out.println(n%10);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();

        fun(a);
//        while(a!=0){
//
//            n= a%10;
//            a=a/10;
//            System.out.println(n);

        }


    }
//}
