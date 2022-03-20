package io.delightedqian.d1_static;

import java.util.Random;

/**
 * Project Name: Util
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/20
 * TIME:  18:57
 */

public class Util {
    //如下是私有化构造器
    private Util(){
    }
//如下是自动生成的构造器，就是在创建对象是用的
//    public Util() {
//    }


    public static String createVerifyCode(int n){
        String code = "";
        String data = "abcdefghigklmnopqrstuvwxyz1234567890ASDFGHJKLQWERTYUIOPZXCVBNM";
        Random r = new Random();
        for (int i = 0; i <n ; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;

    }

}
