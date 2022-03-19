package io.delightedqian;

/**
 * Project Name: TestDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/10
 * TIME:  9:09
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Student01 stu = new Student01();
        stu.setName("张三");
        stu.setAge(18);
        System.out.println("我叫"+stu.getName()+"年龄"+stu.getAge());
    }

    public static void main3(String[] args) {
        Student stu1 = new Student();
        System.out.println("====================");
        Student stu2 = new Student("张三",30);
        System.out.println("我叫" + stu2.getName() +"年龄" + stu2.getAge());

    }

    public static void main2(String[] args) {
        Person01 ph = new Person01();
        ph.name = "王健林";
        ph.sayHello("王思聪");
    }

    public static void main1(String[] args) {
        Person ph = new Person();
        ph.name = "张三";
//        ph.age  =18;
        ph.setAge(18);
        ph.setMale(true);
        System.out.println("我叫" + ph.name);
        System.out.println("年龄"+ ph.getAge());
        System.out.println("是Male"+ " : "+ph.isMale() );
//        ph.show();

    }
}
