package io.delightedqian.homework02;

/**
 * Project Name: Apple
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  19:24
 */
public class Apple extends Goods{
    private String variety;
    public void setVariety(String variety){
        this.variety=variety;
    }
    public String getVariety(){
        return variety;
    }
    public static void main(String[] args) {
        Apple a = new Apple();
        a.setId("00106");
        a.setWeight(0.2);
        a.setPrice(4);
        a.setVariety("黄元帅");
        System.out.println(a.getId());
        System.out.println(a.getWeight());
        System.out.println(a.getPrice());
        System.out.println(a.getVariety());
    }
}
