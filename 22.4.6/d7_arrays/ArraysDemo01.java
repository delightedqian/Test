package io.delightedqian.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Project Name: ArraysDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/7
 * TIME:  15:29
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr = {25,45,85,32,12,54,65,10};
        System.out.println(Arrays.toString(arr));

        //排序的API，默认是升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分搜索技术，前提是必须排好序的数组
        int index=Arrays.binarySearch(arr,12);
        System.out.println(index);
    }
}
