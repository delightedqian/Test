import java.util.Scanner;

/**
 * Project Name: TestDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/2/8
 * TIME:  9:37
 */
public class TestDemo {

    public static int factor(int n){

        int sum = 0;
        for(int i =1 ; i<=n;i++){
            sum+=fac(i);
        }

        return sum;
    }
    public static int fac(int num){
        int ret =1;
        for(int i =1;i<=num;i++){
            ret*=i;
        }
        return ret;
    }
    public static void main2(String[] args) {
//        int n=5;
//        int ret =factor(n);
        System.out.println(factor(5));
   }







    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxThreeNum(n1,n2,n3);
        System.out.println(ret);
    }
    public static  int maxNum(int num1,int num2){

        return num1>num2?num1 : num2 ;

    }
    public static  int maxThreeNum(int num1,int num2,int num3){

        return maxNum(maxNum(num1,num2),num3);
    }
}
