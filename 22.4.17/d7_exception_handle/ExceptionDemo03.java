package io.delightedqian.d7_exception_handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name: ExceptionDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  20:13
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            parseTime("2021-11-11 10-11:11");
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("程序结束");
    }

    public static void parseTime(String date) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);


    }
}
