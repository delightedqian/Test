package io.delightedqian.d2_stream.employee;

import io.delightedqian.d2_stream.employee.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Project Name: StreamDemo04
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  12:29
 */
public class StreamDemo04 {
    public static double allMoney;
    public static double allMoney2; //两个部门一起的

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("员工1", '男', 15000, 20000, null));
        one.add(new Employee("员工2", '男', 18000, 10000, "顶撞上司"));
        one.add(new Employee("员工3", '女', 17000, 30000, null));
        one.add(new Employee("员工4", '男', 16000, 15000, null));
        List<Employee> two = new ArrayList<>();
        two.add(new Employee("员工1", '男', 15000, 20000, null));
        two.add(new Employee("员工2", '男', 16000, 50000, null));
        two.add(new Employee("员工3", '女', 17000, 30000, null));
        two.add(new Employee("员工4", '女', 14000, 25000, null));
        two.add(new Employee("员工5", '男', 12000, 20080, null));

//        Employee e = one.stream().max( ( o1,o2)-> {
//           return Double.compare(o1.getBonus() + o1.getSalary(), o2.getBonus() + o2.getSalary());
//                }
//        ).get();
//        System.out.println(e);
        //一部与二部最高工资
//        Topformer e2 = one.stream().max((o1, o2) -> {
////            return Double.compare(o1.getBonus() + o1.getSalary(), o2.getBonus() + o2.getSalary());
////        }).map(e -> new Topformer(e.getName(), e.getBonus() + e.getSalary())).get();
////        System.out.println(e2);
//
//        Topformer e3 = two.stream().max((o1, o2) -> {
//            return Double.compare(o1.getBonus() + o1.getSalary(), o2.getBonus() + o2.getSalary());
//        }).map(e -> new Topformer(e.getName(), e.getBonus() + e.getSalary())).get();
//        System.out.println(e3);
        //一部与二部平均
//        one.stream().sorted((e1,e2)->Double.compare(e1.getBonus()+e1.getSalary(),e2.getBonus()+e2.getSalary()))
//                .skip(1).limit(one.size()-2).forEach(e->{
//                   allMoney+=e.getBonus()+e.getSalary();
//                } );
//          System.out.println(allMoney/one.size()-2);

//          two.stream().sorted((e1,e2)->Double.compare(e1.getBonus()+e2.getSalary(),e2.getBonus()+e2.getSalary()))
//                 .skip(1).limit(two.size()-2).forEach(e->{
//                     allMoney+=e.getBonus()+e.getSalary();
//                  });
//          System.out.println(allMoney/two.size()-2);

        //两个部门平均
        Stream<Employee> s1 = one.stream();
        Stream<Employee> s2 = two.stream();
        Stream<Employee> s3 = Stream.concat(one.stream(), two.stream());
        s3.sorted((e1, e2) ->
                Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(e -> {
            allMoney2 += e.getBonus() + e.getSalary();
        });
        //转变成大数据类型
        BigDecimal a = BigDecimal.valueOf(allMoney2);
        BigDecimal b = BigDecimal.valueOf((one.size() + two.size() - 2));
        System.out.println(a.divide(b, 2, BigDecimal.ROUND_HALF_UP));


    }
}
