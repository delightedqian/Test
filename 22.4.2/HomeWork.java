package delightedqian.io;

import java.util.Scanner;

/**
 * Project Name: HomeWork
 * Description:使用二维数组，通过键盘输入10个同学的3门课成绩，输出成绩表，成绩表包括：
 * 每个同学的成绩、总分、平均分及不及格的门数。输出班级每门课的平均分、最高分和最低分。
 * USER: ChenXiaoqian
 * DATE:  2022/4/2
 * TIME:  18:41
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] scores = new double[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的成绩");
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入课门" + (j + 1) + "的成绩");
                scores[i][j] = sc.nextDouble();
            }
        }
        printStudentScores(scores);
    }

    /**
     * 打印学生成绩表
     *
     * @param scores 10个学生的3门成绩
     */
    public static void printStudentScores(double[][] scores) {

        System.out.println("成绩表如下");
        for (int i = 0; i < 2; i++) {
            double sum = 0;
            double average = 0;
            System.out.println("同学" + (i + 1));
            //计算每位同学的成绩总和
            for (int j = 0; j < 3; j++) {
                System.out.print("课门" + (j + 1) + ":" + " " + scores[i][j]);
                sum += scores[i][j];
            }
            //平均
            average = sum / 3;

            System.out.print(" " + "总分：" + sum);
            System.out.print(" " + "平均分" + average);

            //统计不及格门数
            System.out.println(" " + "不及格课门" + notOk(i, scores));
        }
    }

    /**
     * 统计不及格的课门
     *
     * @param scores 10个学生的3门成绩
     * @return 返回不及格课门数
     */
    public static int notOk(int m, double[][] scores) {
        int count = 0;
        for (int j = 0; j < 3; j++) {
            if (scores[m][j] < 60) {
                count++;
            }
        }
        return count;
    }

    /**
     * 打印班级每门课平均分，最高分，最低分
     *
     * @param scores
     */
    public static double printClassScores(int m, double[][] scores) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < 2; i++) {
            sum += scores[i][m];
        }
        return sum / 2.0;
    }

}
