package io.delightedqian.d4_polymorphic_test;

/**
 * Project Name: Computer
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/28
 * TIME:  20:04
 */
public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }
    public  void start(){
        System.out.println(name + "开机成功");

    }
    public void installUSB(USB usb) {
        usb.connect();
        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.dbClick();
        } else if (usb instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }
        usb.unconnect();
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
