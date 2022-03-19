import java.util.Arrays;
import java.util.Scanner;

/**
 * Project Name: TestDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/2/10
 * TIME:  9:47
 */
public class TestDemo {

    public static int find (int[]array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
               return i;
            }
        }
        return -1;
    }



    public static int maxArray(int[] array){
        int max =array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max= array[i];
            }

        }
        return max;
    }

    public static  int[] copyArray(int[] array){
        int[]ret = new int[array.length];
        for(int i=0;i<array.length;i++){
            ret[i]=array[i];
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};


       int ret= find(array,5);
        System.out.println("下标是  "+ ret);

//        int[] ret=copyArray(array);
//        System.out.println(Arrays.toString(ret));


        
//         int m = maxArray(array);
//        System.out.println(m);
    }

}
