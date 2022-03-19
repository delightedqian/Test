package io.delightedqian;

import java.util.ArrayList;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/14
 * TIME:  19:45
 */
public class TestDemo01 {
    public static void main(String[] args) {
        //1.定义一个Movie类
        //2.创建三个电影对象

        Movie m1 = new Movie("肖申克的救赎",9.7,"罗宾斯");
        Movie m2 = new Movie("霸王别姬",6.5,"张国荣，张丰毅");
        Movie m3 = new Movie("阿甘正传",9.2,"汤姆.汉克斯");
        //3.创建一个电影类的ArrayList，存储三部电影
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        //System.out.println(movies);
        //4.遍历电影类型的集合中每个对象，访问它的信息即可
        for (int i = 0; i <movies.size() ; i++) {
            Movie m =movies.get(i);

            System.out.println(m.getName());
            System.out.println(m.getActor());
            System.out.println(m.getScore());
            System.out.println("------------------------");

        }


    }
}
