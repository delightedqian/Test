package io.delightedqian.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Project Name: StreamDemo03
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  9:39
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("张三丰");
        lists.add("张三丰");
        lists.add("王五");
//        lists.add("李四");
//        lists.add("张之");
//        lists.add("张六文");

        //lists.stream().filter(s-> s.startsWith("张")).limit(2).distinct().forEach(s -> System.out.println(s));
        //System.out.println(lists.stream().count());
        //lists.stream().map(s->"黑马的："+s).forEach(s -> System.out.println(s));
        Stream<String> a1 = lists.stream().filter(s->s.startsWith("张"));
        Stream<String> a2 = lists.stream().filter(s->s.startsWith("王"));
        Stream<String> a3 = Stream.concat(a1,a2);
        a3.forEach(s -> System.out.println(s));

     }
}
