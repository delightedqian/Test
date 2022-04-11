package io.delightedqian.d5_collection_list;

import java.util.LinkedList;

/**
 * Project Name: ListDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/11
 * TIME:  11:59
 */
public class ListDemo03 {
    public static void main(String[] args) {
        //LinkedList可以完成栈 队列 结构
        //栈
        //我们要用LinkedList的方法，所以不能再用多态的写法
        LinkedList<String> stack = new LinkedList<>();
        //压栈  入栈
        stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);
        //出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        //队列
        LinkedList<String> queue = new LinkedList<>();
        //入列
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        //出列
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
    }
}
