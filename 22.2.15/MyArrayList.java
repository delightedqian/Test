import java.util.Arrays;

/**
 * Project Name: MyArrayList
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/2/14
 * TIME:  15:17
 */
public class MyArrayList {
    public int [] elem; //数组
    public int usedSize;//有效的数据的个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    private void isEmpty(){
        if(this.usedSize==0){
            throw new RuntimeException("顺序表为空");
        }
        //return this.usedSize==0; //判断顺序表是否为空
    }
    private  void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");

        }
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
    //删除第一次出现的数字
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有要找的数字");
            return;
        }
        for(int i =index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }

//    public void remove(int toRemove){
//        for(int i=0;i<this.usedSize;i++){
//            if(elem[i]==toRemove){
//                elem[i]=elem[i+1];
//            }
//            this.usedSize--;
//        }
//    }

    //获取顺序表的长度
    public int size(){return this.usedSize;}

    //获取 pos 位置的元素
    public int getPos(int pos){
        isEmpty();
//        if(isEmpty()){
//            throw new RuntimeException("顺序表为空");//手动抛出异常
//
//        }
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法");

        }
        return (this.elem[pos]);

//        if(pos<0||pos>this.usedSize){
//            throw new RuntimeException("pos位置不合法");
//        }


    }

    //以下为自己写的，上面是老师
//    public int getPos(int pos){
//        if(this.usedSize==0||pos>this.usedSize-1){
//            return -1;
//        }
//        return (this.elem[pos]);
//    }


    //判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i =0;i<this.usedSize;i++){
            if(elem[i]==toFind)
                return true;
        }
        return false;

    }
    //查找某个元素的位置
    public int search(int toFind){
        for(int i =0;i<this.usedSize;i++){
            if(elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();

    }
    //判断数组是否满了
    private boolean isFUll(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos,int data){

        if(isFUll()){
            this.elem=
            Arrays.copyOf(this.elem,2*this.elem.length);
            //return; 如果数组满了，我拷贝数组使其变为两倍
        }

        if(pos<0||pos>this.usedSize){
            return;
        }
        for( int i = this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

}
