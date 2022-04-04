package io.delightedqian.d1_date;

import java.util.Date;

/**
 * Project Name: DateDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/3
 * TIME:  19:14
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        System.out.println("------------");
        Date d1 = new Date();
        System.out.println(d1);
        long time2 = System.currentTimeMillis();
        time2+=(60*60+121)*1000;

        Date d2 = new Date(time2);
        System.out.println(d2);

        d1.setTime(time2);
        System.out.println(d1);
    }
}
