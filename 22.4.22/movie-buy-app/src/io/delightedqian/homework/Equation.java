package io.delightedqian.homework;

/**
 * Project Name: Equation
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/22
 * TIME:  14:46
 */
public class Equation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    /* *
     求方程的根
     */
    public void FindRoot(){
       double think = (b*b)-(4*a*c);
       if(think > 0){
           x1=(-b+Math.sqrt(think))/(2*a);
           x2=(-b-Math.sqrt(think))/(2*a);
       }else{
           System.out.println("无实数解");
       }
    }
    /* *
     输出方法的根
     */
    public void Print(){
        System.out.println("方程的根1:"+x1+"方程的根2:"+x2);
    }

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
