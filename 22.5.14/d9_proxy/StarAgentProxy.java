package io.delightedqian.d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project Name: StarAgentProxy
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/13
 * TIME:  19:48
 */
public class StarAgentProxy {
    public static Skill getProxy(Star obj) {
        return (Skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收首付");
                        Object rs = method.invoke(obj, args);
                        System.out.println("收尾款");
                        return rs;
                    }
                });
    }
}
