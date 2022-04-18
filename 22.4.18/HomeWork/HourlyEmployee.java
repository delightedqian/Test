package io.delightedqian.HomeWork;

/**
 * Project Name: HourlyEmployee
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  15:59
 */
public class HourlyEmployee extends Employee {
    //每小时工资  与   小时数
    private double hourSalary;
    private int hour;
    //总工资
    private double salary;

    public double getsalary(){
        if(hour > 160){
           salary=160*hourSalary+(hour-160)*hourSalary*1.5;
        }
        return salary;
    }



    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
