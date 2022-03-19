package io.delightedqian;

/**
 * Project Name: TestDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/8
 * TIME:  16:49
 */
public class TestDemo03 {
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 8, 6, 5, 7, 52, 4,69,100};
        int max = 0;
       /* for(int i=0;i<arrayA.length;i++){
            System.out.println(arrayA[i]);
        }*/
        for (int i = 0; i < arrayA.length-1; i++) {
            if (arrayA[i] > arrayA[i + 1]) {
                max = arrayA[i];
            } else {
                max = arrayA[i + 1];
            }

        }
        System.out.println(max);
    }
}
