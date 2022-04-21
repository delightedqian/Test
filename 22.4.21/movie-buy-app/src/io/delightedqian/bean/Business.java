package io.delightedqian.bean;

/**
 * Project Name: Business
 * Description:  商家类
 * USER: ChenXiaoqian
 * DATE:  2022/4/21
 * TIME:  11:02
 */
public class Business extends User {
    private String shopName;  //店铺名称
    private String address; // 店铺地址

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addrress) {
        this.address = addrress;
    }
}
