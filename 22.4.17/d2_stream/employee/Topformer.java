package io.delightedqian.d2_stream.employee;

/**
 * Project Name: Topformer
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  12:47
 */
public class Topformer {
    private String name;
    private double money;

    public Topformer() {
    }

    public Topformer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Topformer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
