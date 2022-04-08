package io.delightedqian.HomeWork;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  9:49
 */

    public class Product {
        String name;
        String id;
        double price;
        public void computeDiscount(double percent){
            System.out.println(price*percent);
        }
        public Product(){
            name="投影仪";
            id="00102";
            price=8600.0;
        }
        public Product(String n,String i,double p){
            name=n;
            id=i;
            price=p;
        }
        public static void main(String[] args) {
            Product p1=new Product();
            Product p2=new Product("打印机","00101",1200.0);
            p1.computeDiscount(0.8);
            p2.computeDiscount(0.8);
        }
    }

//    String name;
//    String id;
//    double price;
//
//    public static void computeDiscount(double percent){
//        System.out.println(price*percent);
//    }
//    public Product(){
//        name="投影仪";
//        id="00102";
//        price=8600.0;
//    }
//    public Product(String a,String b,double c){
//        name=a;
//        id=b;
//        price=c;
//    }
//
//    public static void main(String[]args){
//        Product p1=new Product();
//        Product p2=new Product("打印机","00101",1200.0);
//        p1.computeDiscount(0.8,8600.0);
//        p2.computeDiscount(0.8,1200.0);
//    }


