package io.delightedqian;

/**
 * Project Name: TestDemo04
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/8
 * TIME:  18:29
 */
public class TestDemo04 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 4, 5, 8, 7, 8, 9};
       /* for (int i = 0; i < (arrayA.length); i++) {
            arrayA[i] = arrayA[arrayA.length - (i + 1)];
        }*/
       for(int min = 0, max = arrayA.length-1; min<max; min++,max--){
           int temp =arrayA[min];
           arrayA[min] = arrayA[max];

           arrayA[max] = temp;
       }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
