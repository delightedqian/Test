package io.delightedqian.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Project Name: Demo08Duration
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/5
 * TIME:  9:59
 */
public class Demo08Duration {
    public static void main(String[] args) {
            LocalDateTime today = LocalDateTime.now();
            System.out.println(today);

            LocalDateTime birthday = LocalDateTime.of(2022,4,04,
                    9,00,00);
            System.out.println(birthday);

        Duration duration = Duration.between(birthday,today);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }
}
