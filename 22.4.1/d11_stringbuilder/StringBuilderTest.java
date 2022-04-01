package io.delightedqian.d11_stringbuilder;

/**
 * Project Name: StringBuilderTest
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/1
 * TIME:  20:31
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        int arr[] = {36, 58, 45};
        System.out.println(toString(arr));

    }

    public static String toString(int[] arr) {
        if (arr != null) {
            StringBuilder st = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                st.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            st.append("]");
            return st.toString();

        } else {
            return null;
        }


    }
}