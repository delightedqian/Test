package io.delightedqian.d1_junit;

/**
 * Project Name: io.delightedqian.d1_junit.UserService
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/10
 * TIME:  18:52
 */
// 业务方法
public class UserService {
    public String loginName(String loginName , String passWord){
        if("admin".equals(loginName)&&"123456".equals(passWord)){
            return "登陆成功";
        }else {
            return "用户名或者密码有错误";
        }
    }
    public void selectNames(){
        System.out.println(10/2);
        System.out.println("查询全部用户名成功");
    }
}
