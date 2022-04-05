package io.delightedqian.d6_regex;

/**
 * Project Name: RegexDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/5
 * TIME:  14:45
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        System.out.println(checkQQ("5565586a5"));
        System.out.println(checkQQ2("554455q"));
        System.out.println(checkQQ2("45456"));

    }

    public static boolean checkQQ(String qq){
        if(qq==null||qq.length()<6||qq.length()>20){
            return false;
        }

        for (int i = 0; i <qq.length() ; i++) {
            if(qq.charAt(i)<'0'||qq.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }
}
