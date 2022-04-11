package io.delightedqian.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/11
 * TIME:  15:24
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("张三");
        System.out.println(list);
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if(ele.equals("Java")){
//                //list.remove("Java");
//                //必须用迭代器自己的删除方法
//                it.remove();
//            }
//        }
//ForEach
//        for (String s : list) {
//            if("java".equals(s)){
//                list.remove("java");
//            }
//        }
//Lambda
//        list.forEach((String s) ->{
//            if("java".equals(s)){
//                list.remove("java");
//            }
//        });

//        for (int i = 0; i<list.size() ; i++) {
//            String ele = list.get(i);
//            if(ele.equals("Java")){
//                list.remove("Java");
//            }
//        }
        for (int i = list.size() - 1; i > 0; i--) {
            String ele = list.get(i);
            if (ele.equals("Java")) {
                list.remove("Java");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if (ele.equals("Java")) {
                list.remove("Java");
                i--;
            }
            System.out.println(list);
        }
    }
}
