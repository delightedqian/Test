package io.delightedqian.HomeWork;

/**
 * Project Name: Employee
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  16:58
 */
public class Employee {
    String name;
    int age;
    double salary;
    public  void raise(double p){
        System.out.println(salary + p);
    }
    public Employee(){
        name="Lucy";
        age=26;
        salary=3500.0;
    }
    public Employee(String a,int b,double c){
        name=a;
        age=b;
        salary=c;
    }
    public static void main(String[]args){
        Employee e1= new Employee();
        Employee e2=new Employee("LiLei",30,4500.0);
        e1.raise(200);
        e2.raise(200);
    }
}
