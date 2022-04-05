package io.delightedqian.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;


/**
 * Project Name: Demo07Period
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/5
 * TIME:  9:52
 */
public class Demo07Period {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1998,10,18);
        System.out.println(birthday);

        Period period = Period.between(birthday,today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
