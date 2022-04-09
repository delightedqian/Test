package io.delightedqian.homework02;

/**
 * Project Name: Manager2
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  10:59
 */
public class Manager2 {
    private String sex;
    private static double min_salary;
    public static void setMin_salary(double min){
        min_salary=min;
    }
    public static double getMin_salary(){
        return min_salary;

    }
    public static void main(String []args){
        Manager2 m1=new Manager2();
        Manager2 m2=new Manager2();
        Manager2.setMin_salary(6000.0);
        System.out.println(Manager2.getMin_salary());
        System.out.println(m1.getMin_salary());
        System.out.println(m2.getMin_salary());
    }
}
