package io.delightedqian.d10_tcp_sms;

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

class ServerReaderThread extends Thread {
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            //3 从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //4 把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //5 按照行读取消息
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+"我下线了");
        }

    }
}



