package io.delightedqian.d9_lambda;

/**
 * Project Name: LambdaDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  16:43
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳快");
//            }
//        };

//        Swimming s = ()-> {
//            System.out.println("老师游泳快");
//        };
//        go(s);

        Swimming s = ()->  System.out.println("老师游泳快");
        go(s);

        System.out.println("-------------------");

//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生游得快乐");
//            }
//        });

//        go(() ->{
//                System.out.println("学生游得快乐");
//            }
//        );

        go(() ->   System.out.println("学生游得快乐") );



    }

public static void go(Swimming s){
    System.out.println("开始比赛");
    s.swim();
    System.out.println("结束比赛");
}
}
@FunctionalInterface
interface Swimming{
    void swim();

}