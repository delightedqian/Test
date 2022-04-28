package io.delightedqian.d2_byte_buffer_time;

import java.io.*;

/**
 * Project Name: ByteBufferTimeDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/28
 * TIME:  16:08
 */
public class ByteBufferTimeDemo {
    private static final String SRC_FILE="D:\\My_ok？\\Java数据\\a.zip";
    private static final String DEST_FILE="D:\\My_ok？\\Java数据\\";
    public static void main(String[] args) {
        //copy01();//使用低级的字节流按照一个一个字节的形式复制文件  最慢
        copy02();//使用低级的字节流按照一个一个字节数组的形式复制文件 第二块
        copy03();//缓冲流一个一个字节复制  第二慢
        copy04();//缓冲流一个一个字节数组复制  最快


    }

    private static void copy04() {
        long startTime=System.currentTimeMillis();
        try ( InputStream is = new FileInputStream(SRC_FILE);
              InputStream bis = new BufferedInputStream(is);
              OutputStream os = new FileOutputStream(DEST_FILE+"a4.zip");
              OutputStream bos = new BufferedOutputStream(os);
        ) {
            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; //记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用缓冲流按照一个一个字节数组的形式复制文件"+(endTime-startTime)/1000.0+"s");
    }

    private static void copy03() {
        long startTime=System.currentTimeMillis();
        try{
            InputStream is = new FileInputStream(SRC_FILE);
            InputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(DEST_FILE+"a3.zip");
            OutputStream bos = new BufferedOutputStream(os);

            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用缓冲流流按照一个一个字节的形式复制文件"+(endTime-startTime)/1000.0+"s");
    }


    private static void copy02() {
        long startTime=System.currentTimeMillis();
        try (
                //这里面只能放置资源对象，用完会自动关闭：自动调用
                // 对象的close方法关闭资源（即使出现异常也会做关闭操作）

                //1创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream(SRC_FILE);

                //2创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE+"a2.zip");
        ) {
            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; //记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件"+(endTime-startTime)/1000.0+"s");
    }

    private static void copy01() {
        long startTime=System.currentTimeMillis();
        try{
            InputStream is = new FileInputStream(SRC_FILE);
            OutputStream os = new FileOutputStream(DEST_FILE+"a1.zip");
            int b;
            while ((b=is.read())!=-1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件"+(endTime-startTime)/1000.0+"s");
    }
}
