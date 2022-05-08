package io.delightedqian.d8_socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Project Name: ServerReaderThread
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/8
 * TIME:  18:41
 */
public class ServerReaderThread extends Thread {
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
