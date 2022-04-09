package io.delightedqian.homework02;

/**
 * Project Name: BankCard
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  11:42
 */
public class BankCard {
    private String number;
    private static double min_balance;

    public void setNumber(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }
    public void setMin_balance(double min_balance){
        this.min_balance=min_balance;
    }
    public double getMin_balance(){
        return min_balance;
    }
    public static void main(String []args){
        BankCard b1=new BankCard();
        BankCard b2=new BankCard();
        b1.setNumber("001");
        b1.setMin_balance(10.0);
        b2.setMin_balance(10.0);
        System.out.println(b1.getNumber());
        System.out.println(b1.getMin_balance());
        System.out.println(b2.getNumber());
        System.out.println(b2.getMin_balance());
    }
}
