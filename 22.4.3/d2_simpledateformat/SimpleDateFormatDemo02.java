package io.delightedqian.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name: SimpleDateFormatDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/4
 * TIME:  8:35
 */
public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        String strDate = "2021年8月6日 11:11:11";

        //把字符串时间解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(strDate);

        //2天14小时49分06
        long time1 = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;

        System.out.println(sdf.format(time1));


    }
}
