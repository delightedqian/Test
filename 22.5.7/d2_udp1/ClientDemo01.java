package io.delightedqian.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

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
//        2 创建一个数据包对象封装数据（韭菜盘子）
        byte[] buffer = "我是一颗".getBytes();
        /*byte buf[], int length,
        InetAddress address, int port
        参数一：封装要发送的数据
        参数二：发送数据的大小
        参数三：服务端的主机IP地址
        参数四：服务端的端口
        */
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,
                InetAddress.getLocalHost(),888);
        //3 发送数据
        socket.send(packet);

    }
}
