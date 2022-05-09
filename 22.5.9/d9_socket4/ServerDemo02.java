package io.delightedqian.d9_socket4;

import io.delightedqian.d8_socket3.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * Project Name: ServerDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/8
 * TIME:  16:38
 */
public class ServerDemo02 {
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5,
            6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            //1 注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            while (true) {
                //2 每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "我上线了");
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


