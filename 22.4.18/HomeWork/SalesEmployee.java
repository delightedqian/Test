package io.delightedqian.HomeWork;

/**
 * Project Name: SalesEmployee
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  16:01
 */
public class SalesEmployee extends Employee{
    //员工销售额 与 提成率
    private int sales;
    private double commission;

    double salary =0;
    //提成假设每销售100件（每件100元），提成5%
    public double getsalary() {
        //a为不算提成的销售额
        double a = sales * 100;
        //有几个100
        double b = sales/100;
           return salary = a +a*0.05*b;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
