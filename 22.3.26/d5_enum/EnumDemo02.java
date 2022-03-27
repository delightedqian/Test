package io.delightedqian.d5_enum;

/**
 * Project Name: ConstantDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/26
 * TIME:  16:57
 */
public class EnumDemo02 {
//    public static final int UP = 1;
//    public static final int DOWN = 2;
//    public static final int LEFT = 3;
//    public static final int RIGHT = 4;

    public static void main(String[] args) {
        move(Orientation.UP);
    }

    public static void move(Orientation o) {
        switch (o) {
            case UP:
                System.out.println("向上");
                break;
            case DOWN:
                System.out.println("向下");
                break;
            case LIFT:
                System.out.println("向左");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
        }

    }
}