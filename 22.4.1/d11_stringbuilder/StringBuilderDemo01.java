package io.delightedqian.d11_stringbuilder;

/**
 * Project Name: StringBuilderDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/1
 * TIME:  19:44
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
//        StringBuilder st = new StringBuilder();
//        st.append(56);
//        st.append('s');
//        st.append(3.25);
//        st.append('s');
//        System.out.println(st);

//        StringBuilder st1= new StringBuilder();
//        st1.append(45).append('e').append(3.1555);

        StringBuilder st2 = new StringBuilder();
        st2.append(15).append('f').append("dffd");
        System.out.println(st2);
        String rs = st2.toString();
        check(rs);

    }

    public static void check(String a) {

    }
}
