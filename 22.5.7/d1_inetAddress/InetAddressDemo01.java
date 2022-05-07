package io.delightedqian.d1_inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Project Name: InetAddressDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/7
 * TIME:  15:17
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        //1 获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());
        //2 获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        //3 获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("180.101.49.12");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        //4 判断是否能通   就给5s时间
        System.out.println(ip3.isReachable(5000));

    }
}
