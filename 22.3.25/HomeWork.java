package io.delightedqian;


import java.util.ArrayList;
import java.util.Scanner;


/**
 * Project Name: HomeWork
 * Description:1
 * USER: ChenXiaoqian
 * DATE:  2022/3/22
 * TIME:  16:41
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a>b){
           t=a;
           a=b;
           b=t;
        }
        if(b>c){
            t=b;
            b=c;
            c=t;
        }
        if(a>b){
            t=a;
            a=b;
            b=t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main3(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (i * 5 + j * 3 + k / 3.0 == 100 && i + j + k == 100) {
                        System.out.println("公鸡" + i + "母鸡" + j + "雏鸡" + k);

                    }

                }
            }
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            scores.add(i, sc.nextDouble());
        }


//打印成绩
        printScores(scores);
//平均分
        System.out.println(averageScores(scores));
//统计人数
        System.out.println("优秀的人数：" + count1Student(scores));
        System.out.println("不及格的人数：" + count2Student(scores));

    }

    /**
     * 打印学生的成绩
     *
     * @param scores 全体成绩
     */
    public static void printScores(ArrayList<Double> scores) {
        System.out.println("学生成绩如下");
        int count = 0;
        for (int i = 0; i < 20; i++) {
            count++;
            System.out.print("  " + scores.get(i));
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }

    }

    /**
     * 平均分
     *
     * @param scores 全体成绩
     * @return
     */
    public static double averageScores(ArrayList<Double> scores) {
        System.out.println("学生的平均成绩如下");
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            sum += scores.get(i);
        }
        double average = sum / 20;
        return average;
    }

    /**
     * 统计优秀的学生
     *
     * @param scores 全体成绩
     * @return
     */
    public static int count1Student(ArrayList<Double> scores) {
        int count1 = 0;
        for (int i = 0; i < 20; i++) {
            if (scores.get(i) > 90) {
                count1++;
            }
        }
        return count1;
    }

    /**
     * 统计不及格的学生
     *
     * @param scores 全体成绩
     * @return
     */
    public static int count2Student(ArrayList<Double> scores) {
        int count2 = 0;
        for (int i = 0; i < 20; i++) {
            if (scores.get(i) < 60) {
                count2++;
            }
        }
        return count2;
    }
}


//    public static void main1(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextInt();
//        double b = sc.nextInt();
//        double c = sc.nextInt();
//        double think = (b * b) - (4 * a * c);
//        if (think > 0) {
//            double out1 = (-b + Math.sqrt(think)) / (2 * a);
//            double out2 = (-b - Math.sqrt(think)) / (2 * a);
//            System.out.println(out1);
//            System.out.println(out2);
//        } else {
//            System.out.println("无实数解");
//        }
//    }

