package io.delightedqian.homework;

import java.util.Scanner;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/22
 * TIME:  14:50
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Equation f = new Equation(a,b,c);
        f.FindRoot();
        f.Print();

    }
}
