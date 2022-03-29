package io.delightedqian.d6_innerclass;

/**
 * Project Name: Test02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/29
 * TIME:  19:09
 */
public class Test02 {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People {
    private int heartbeat = 150;

    /*
     成员内部类
     */
    public class Heart {
        private int heartbeat = 110;

        public void show() {
            int heartbeat = 78;
            System.out.println(heartbeat);
            System.out.println(this.heartbeat);
            System.out.println(People.this.heartbeat);

        }
    }
}
