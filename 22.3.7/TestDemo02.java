package io.delightedqian;

/**
 * Project Name: TestDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/7
 * TIME:  18:42
 */
public class TestDemo02 {
    public static void main(String[] args) {
//        System.out.println(isSame(2, 83));
//        System.out.println(isSum(3));
        isPrint(5);

    }

    public static void isPrint(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("helloworld" + "    " + i);
        }
    }


    public static int isSum(int a) {
        int num = 0;
        for (int i = 1; i <= a; i++) {
            num += i;
        }
        return num;
    }

    public static boolean isSame(int a, int b) {
       /* if( a == b ){
            return true;
        }else return false;*/
        return a == b;
    }


}
