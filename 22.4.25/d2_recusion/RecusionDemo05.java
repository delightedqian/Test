package io.delightedqian.d2_recusion;

import java.io.File;

/**
 * Project Name: RecusionDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/25
 * TIME:  18:24
 */
public class RecusionDemo05 {
    public static void main(String[] args) {
        searchFile(new File("D:/"),"MediaCreationTool21H2.exe");
    }

    private static void searchFile(File dir,String fileName) {
        if(dir !=null && dir.isDirectory()){
            //可以找了
            File[] files = dir.listFiles();
            if(files !=null  && files.length > 0){
                for (File file : files) {
                    if(file.isFile()){
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了："+file.getAbsolutePath());
                    }
                    }else{
                        searchFile(file,fileName);
                    }
                }
            }
        }else{
            System.out.println("对不起，当前搜索的位置不是文件夹");
        }
    }
}
