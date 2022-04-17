package io.delightedqian.d7_exception_handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name: ExceptionDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  19:42
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        parseTime("2021-11-11 10-11:11");
        System.out.println("程序结束");
    }
    public static void parseTime(String date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
