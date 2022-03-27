package io.delightedqian.d10_interface;

/**
 * Project Name: InterfaceDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/27
 * TIME:  16:36
 */
public interface InterfaceDemo {

    //接口中的成分特点 JDK1.8之前只能有抽象方法和常量
//    1.常量
//    注意 由于接口体现规范思想，规范默认都是公开的，所以代码层面： public static final可省略不写
//    public static final String SCHOOL_NAME="黑马程序员";
    String SCHOOL_NAME = "黑马程序员";

    //    2.抽象方法
//    由于接口体现规范思想，规范默认都是公开的，所以代码层面： public abstract可省略不写
//    public abstract void run();
    void run();

}
