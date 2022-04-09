package io.delightedqian.homework02;

/**
 * Project Name: Police
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/9
 * TIME:  18:54
 */
public class Police extends Person {
    private String policeId;
    public void setPoliceId(String policeId){
        this.policeId=policeId;
    }
    public String getPoliceId(){
        return policeId;
    }

    public static void main(String[] args) {
        Police p = new Police();
        p.setId("210108");
        p.setName("王红");
        p.setAge(36);
        p.setPoliceId("005");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getPoliceId());
    }
}
