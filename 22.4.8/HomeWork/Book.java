package io.delightedqian.HomeWork;

/**
 * Project Name: Book
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/8
 * TIME:  16:51
 */
public class Book {
    String name;
    String author;
    double price;
    public void show(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
    public Book(){
        name="数据结构";
        author="jane";
        price=45.0;
    }
    public Book(String a,String b,double c){
        name = a;
        author = b;
        price = c;
    }
    public static void main(String []args){
        Book b1 = new Book();
        Book b2 = new Book("Java语言程序设计","Michael",49.8);
        b1.show();
        b2.show();
    }
}
