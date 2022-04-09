package io.delightedqian.homework02;

/**
 * Project Name: Goods
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  19:10
 */
public class Goods {
    private String id;
    private double weight;
    private double price;
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public static void main(String[] args) {

    }
}
