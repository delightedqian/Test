package io.delightedqian.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project Name: Test
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/18
 * TIME:  13:05
 */
public class Test {
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {

            try {
                LOGGER.debug("main方法开始执行");
                LOGGER.info("开始记录第二行，执行除法");
                int a = 10 ;
                int b = 0;
                LOGGER.trace("a = "+a );
                LOGGER.trace("b = "+b );
                System.out.println(a/b);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("功能出现异常"+e);
            }


    }
}
