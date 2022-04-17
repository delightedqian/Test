package io.delightedqian.d5_exception_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name: ExceptionDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  18:58
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date = "2021-04-17 10:58:45";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d );
    }
}
