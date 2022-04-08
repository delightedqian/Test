package io.delightedqian.d8_sort_binarysearch;

import java.util.Arrays;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  8:08
 */
public class TestDemo01 {
    public static void main(String[] args) {

    }

    public static void main1(String[] args) {
        int[] arr = {5, 2, 3, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            // i=0  j = 1 2 3
            // i=1  j = 2 3
            // i=2  j = 3
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
