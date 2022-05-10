package io.delightedqian.d1_junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Project Name: io.delightedqian.d1_junit.TestUserService
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/10
 * TIME:  18:57
 */
public class TestUserService {
    @Before
    public void Before() {
        System.out.println("Before执行一次");
    }

    @After
    public void After() {
        System.out.println("After执行一次");
    }

    //    1 必须是公开的 无参数 无返回值的方法
//    2 测试方法必须使用@Test注解标记
    @Test
    public void testLoginName() {
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");
        //进行预期结果正确性测试 ： 断言
        Assert.assertEquals("你的功能业务可能出现问题", "登陆成功", rs);
    }

    @Test
    public void testSelectNames() {
        UserService userService = new UserService();
        userService.selectNames();
    }
}
