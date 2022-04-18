package io.delightedqian.HomeWork;

/**
 * Project Name: Employee
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  15:54
 */
public class Employee {
    //员工姓名  与  员工生日月份
    private String name;
    private int month;
    public double getSalary(int month){
        double a = 100;
        double b = 0;
     //   假设该月为5月
        if(month==5){
            return a;
        }else return b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public Employee() {
    }
}
