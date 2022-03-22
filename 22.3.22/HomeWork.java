package io.delightedqian;


import java.util.Scanner;


/**
 * Project Name: HomeWork
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/22
 * TIME:  16:41
 */
public class HomeWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[20];
        for (int i = 0; i < 20; i++) {
            scores[i] = sc.nextInt();
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
    public static void printScores(double[] scores) {
        System.out.println("学生成绩如下");
        int count = 0;
        for (int i = 0; i < 20; i++) {
            count++;
            System.out.print("  " + scores[i]);
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
    public static double averageScores(double[] scores) {
        System.out.println("学生的平均成绩如下");
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            sum += scores[i];
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
    public static int count1Student(double[] scores) {
        int count1 = 0;
        for (int i = 0; i < 20; i++) {
            if (scores[i] > 90) {
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
    public static int count2Student(double[] scores) {
        int count2 = 0;
        for (int i = 0; i < 20; i++) {
            if (scores[i] < 60) {
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

