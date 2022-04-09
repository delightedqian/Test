package io.delightedqian.homework02;

/**
 * Project Name: Teacher
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  14:58
 */
public class Teacher extends Person{
    private String teacherId;
    public void setTeacherId(String teacherId){
        this.teacherId=teacherId;
    }
    public String getTeacherId(){
        return teacherId;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setId("220101");
        t.setName("李明");
        t.setAge(30);
        t.setTeacherId("001");
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getTeacherId());
    }
}
