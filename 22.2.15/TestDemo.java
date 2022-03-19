/**
 * Project Name: TestDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/2/14
 * TIME:  16:37
 */
public class TestDemo {
    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        for(int i =0;i<10;i++){
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.add(11,113);
        myArrayList1.display();
        myArrayList1.remove(5);
        myArrayList1.display();
        myArrayList1.clear();
        System.out.println("=======================");
        myArrayList1.display();
//        System.out.println("=======================");
//
//
//        System.out.println(myArrayList1.contains(5));

       // System.out.println(myArrayList1.getPos(5));
    }
}
