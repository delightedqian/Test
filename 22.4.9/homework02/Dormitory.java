package io.delightedqian.homework02;

/**
 * Project Name: Dormitory
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  11:56
 */
public class Dormitory {
    String roomNumber="001";
    int floor=2;
    public void show(){
        String roomNumber="002";
        System.out.println(roomNumber);
        System.out.println(floor);
    }
    public static void main(String[] args) {
        Dormitory d =new Dormitory();
        d.show();
    }
}
