package io.delightedqian.HomeWork;

/**
 * Project Name: SalariedEmployee
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  15:57
 */
public class SalariedEmployee extends Employee {
    //拿固定工资的员工的工资
    private double salariedSalary;
    public double getSalariedSalary() {
        return salariedSalary;
    }
    public void setSalariedSalary(double salariedSalary) {
        this.salariedSalary = salariedSalary;
    }
}
