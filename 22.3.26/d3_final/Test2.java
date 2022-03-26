package io.delightedqian.d3_final;

/**
 * Project Name: Test2
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/26
 * TIME:  14:59
 */
public class Test2 {
    public static void main(String[] args) {
        final double rate=3.14;
//        rate =3;
        final Teacher t2 = new Teacher("学习");
//        t2=null;
        System.out.println(t2.getHobby());
        t2.setHobby("吃饭 睡觉");
        System.out.println(t2.getHobby());
    }
}
class Teacher{
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}