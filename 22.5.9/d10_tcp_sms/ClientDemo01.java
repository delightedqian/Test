package io.delightedqian.d10_tcp_sms;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Project Name: ClientDemo01
 * Description:  1 创建客户端的Socket对象，请求与服务端链接
 * 2 使用Socket对象调用getOutputStream（）方法得到字节输出流
 * 3 使用字节输出流完成数据的发送
 * USER: ChenXiaoqian
 * DATE:  2022/5/8
 * TIME:  15:45
 */
public class ClientDemo01 {
    public static void main(String[] args) {
        try {
            //1 创建客户端的Socket对象，请求与服务端链接
            //public Socket(String host, int port)
            //参数一  服务端的IP
            //参数二  服务端的端口
            Socket socket = new Socket("127.0.0.1",7777);
            //创建一个独立的线程专门负责这个客户端的读消息（服务端随时可能转发消息过来）
             new ClientReaderThread(socket).start();
            //2 使用Socket对象调用getOutputStream（）方法得到字节输出流
            OutputStream os = socket.getOutputStream();

            //3 把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            Scanner sc= new Scanner(System.in);
            while (true) {
                System.out.println("请说：");
                String msg=sc.nextLine();
                //4 发送消息
                ps.println(msg);
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
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
                System.out.println("收到消息："+msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把你踢出去了！");
        }

    }
}
