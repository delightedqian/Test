package io.delightedqian;

/**
 * Project Name: Account
 * Description: 定义的账户类
 * USER: ChenXiaoqian
 * DATE:  2022/3/19
 * TIME:  9:24
 */
//定义一个账户类
public class Account {
    private String cardID;
    private String userName;
    private String passWord;
    private double money;
    private double quotaMoney;

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
