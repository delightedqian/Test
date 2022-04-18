package io.delightedqian.HomeWork;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  19:04
 */
public class Test {
    public static void main(String[] args) {
        // Employee[] employees = {employee1,};

        //第一类员工
        SalariedEmployee employee = new SalariedEmployee();
        //传入name 与 birthday
        employee.setName("小王");
        employee.setMonth(5);
        //传入固定工资
        employee.setSalariedSalary(3500);
        //生日判断
        double a = employee.getSalariedSalary() + employee.getSalary(5);
        System.out.println("拿固定工资的员工1" + employee.getName() + ",生日为" + employee.getMonth() +
                "月" + ",原工资为" + employee.getSalariedSalary() + ",加生日福利后的工资为" + a);
        //第二类员工
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        //传入name 与 birthday
        hourlyEmployee.setName("小刚");
        hourlyEmployee.setMonth(4);
        //传入 每小时工资 与 工时
        hourlyEmployee.setHourSalary(20);
        hourlyEmployee.setHour(300);

        System.out.println("按小时拿工资的员工2" + hourlyEmployee.getName() + ",生日为" + hourlyEmployee.getMonth() +
                "月,每小时工资" + hourlyEmployee.getHourSalary() + "元," + "工时为" + hourlyEmployee.getHour()
                + "小时" + ",工资为" + hourlyEmployee.getsalary());

        //第三类员工
        SalesEmployee salesEmployee = new SalesEmployee();
        //传入name 与 birthday
        salesEmployee.setName("小李");
        salesEmployee.setMonth(3);
        //传入 月销售额 与 提成率
        salesEmployee.setSales(100);
        salesEmployee.setCommission(0.05);

        System.out.println("由月销售额决定工资的员工3"+salesEmployee.getName() + ",生日为" +salesEmployee.getMonth()+
                "月,销售额为"+salesEmployee.getSales()+"提成为5%"+",工资为"+salesEmployee.getsalary());
    }
}
