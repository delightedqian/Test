package io.delightedqian.d8_sort_binarysearch;

/**
 * Project Name: TestDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  8:20
 */
public class TestDemo02 {
    public static void main(String[] args) {
        int arr[]={15,26,35,42,48,49,69};
        System.out.println(binarySearch(arr, 26));
    }
    public static int binarySearch(int[]arr,int data){
        //定义左端  与  右端
        int left=0;
        int right=arr.length-1;
        //左端必须始终<=右端
        while(left<=right){
            //折半
            int middleIndex=(left+right)/2;
            //如果要找的元素大于中间的元素，从中间的那个元素（包括）向左全删，因为左边更小，
            //此时左端需要变成middleIndex+1;
            if(data>arr[middleIndex]){
                left=middleIndex+1;
                //如果要找的元素小于中间的元素，从中间的那个元素（包括）向右全删，因为右边更大，
                //此时右端需要变成middleIndex-1;
            }else if(data<arr[middleIndex]){
                right=middleIndex-1;
                //找到元素的情况
            }else {
                return middleIndex;
            }
        }
        //没有找到
        return -1;
    }
}
