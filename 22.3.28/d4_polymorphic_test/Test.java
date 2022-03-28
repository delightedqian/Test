package io.delightedqian.d4_polymorphic_test;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  19:57
 */
public class Test {
    public static void main(String[] args) {
        Computer c =new Computer("lenovo");
        c.start();

       USB u = new KeyBoard("罗技");
        c.installUSB(u);
        USB usb =new Mouse("acer");
        c.installUSB(usb);
    }
}
