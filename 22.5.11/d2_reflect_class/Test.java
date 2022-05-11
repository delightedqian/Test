package io.delightedqian.d2_reflect_class;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/11
 * TIME:  19:14
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1 Class类中的一个静态方法：forName(权限名：包名+类名)
        Class c = Class.forName("io.delightedqian.d2_reflect_class.Student");
        System.out.println(c);

        //2 类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        //3 对象.getClass()  获取对象对应的Class对象
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }
}
