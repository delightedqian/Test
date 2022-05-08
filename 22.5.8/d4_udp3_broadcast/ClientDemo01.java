package io.delightedqian.d4_udp3_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Project Name: ClientDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/7
 * TIME:  18:48
 */
public class ClientDemo01 {
    /*客户端  即  发送端*/
    public static void main(String[] args) throws Exception {
//        1 创建发送端对象 ：发送端自带默认端口号（人）
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("离线成功！");
                socket.close();
                break;
            }
//        2 创建一个数据包对象封装数据（韭菜盘子）
            byte[] buffer = msg.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("255.255.255.255"), 888);
            //3 发送数据
            socket.send(packet);
        }

    }
}
