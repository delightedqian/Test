package io.delightedqian.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name: simpledateformatDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/3
 * TIME:  20:20
 */
public class simpledateformatDemo01 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        //EEE是表示星期几  a时表示上下午
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        String rs = sdf.format(d);
        System.out.println(rs);
        System.out.println("---------");

        long time1 = System.currentTimeMillis()+121*1000 ;
        String rs2  = sdf.format(time1);
        System.out.println(rs2);
    }
}