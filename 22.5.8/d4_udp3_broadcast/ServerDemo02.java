package io.delightedqian.d4_udp3_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Project Name: ServerDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/7
 * TIME:  18:58
 */
public class ServerDemo02 {
    /*服务端  即  接收端*/
    public static void main(String[] args) throws Exception {
        System.out.println("====服务启动====");
        //1 创建接收端对象：注册端口（人）
        DatagramSocket socket = new DatagramSocket(888);
        //2 创建一个数据包对象接收数据（韭菜盘子）
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        //3 等待接收数据
        while (true) {
            socket.receive(packet);
            String rs = new String(buffer);
            System.out.println("收到了来自IP为："+packet.getAddress()+
                    "对方端口是："+packet.getPort()+"内容为："+rs);
        }

    }
}
