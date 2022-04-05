package io.delightedqian.d4_jdk8_time;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Project Name: Demo06DateTimeFormat
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/4
 * TIME:  20:34
 */
public class Demo06DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss EEE a");
        System.out.println(dtf.format(ldt));
        System.out.println(ldt.format(dtf));

        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 =LocalDateTime.parse("2019-11-11 11:11:11",dtf1);
        System.out.println(ldt1);
        //一年当中第几天
        System.out.println(ldt1.getDayOfYear());
    }
}
