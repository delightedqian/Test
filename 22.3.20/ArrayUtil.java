package io.delightedqian.d1_static;

/**
 * Project Name: ArrayUtil
 * Description:  数组的工具类
 * USER: ChenXiaoqian
 * DATE:  2022/3/20
 * TIME:  19:19
 */
public class ArrayUtil {
    /*构造器私有*/
    private ArrayUtil(){
    }
    public static String toString(int[] arr){
        if(arr == null){
            return null;
        }
            String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result+=(i==arr.length-1?arr[i]:arr[i]+", ");
        }
        result+="]";
        return result;
    }
}
