package io.delightedqian.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Project Name: ArraysDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/7
 * TIME:  20:26
 */
public class ArraysDemo02 {
    public static void main(String[] args) {
        Integer[] arr = {12, 36, 32, 15, 45, 85, 45};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*if(o1-o2>0){
                    return 1;
                }else if(o1-o2<0){
                    return -1;
                }
                return 0;*/
                //上面可以简写成，默认升序
                //return o1-o2;
                //默认降序
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
