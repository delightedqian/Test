package io.delightedqian.d7_socket2;

import java.io.OutputStream;
import java.io.PrintStream;
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
