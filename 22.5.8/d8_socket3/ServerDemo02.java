package io.delightedqian.d8_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Project Name: ServerDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/8
 * TIME:  16:38
 */
public class ServerDemo02 {
    public static void main(String[] args) {

        try {
            System.out.println("===服务端启动成功===");
            //1 注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            while (true) {
                //2 每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+"我上线了");
                //3开始创建独立的线程
                new ServerReaderThread(socket).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


