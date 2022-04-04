package io.delightedqian.d4_jdk8_time;

import java.time.Instant;
import java.util.Date;

/**
 * Project Name: Demo05Instant
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/4
 * TIME:  18:26
 */
public class Demo05Instant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        Date date = Date.from()
        System.out.println(date);

        Instant instant1= date.toInstant();
        System.out.println(instant1);
    }
}
