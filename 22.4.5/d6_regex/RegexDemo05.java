package io.delightedqian.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project Name: RegexDemo05
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/6
 * TIME:  11:52
 */
public class RegexDemo05 {
    public static void main(String[] args) {
        String rs="来自黑马程序员，电话020-4584484848，或者联系邮箱"+
                "itcast@itcast.cn,电话 15864845545 02855656555"+
                "邮箱 1753450864@qq.com,400-582-54455,40015564564D";

        //需求：从上面的内容中获取电话，邮箱
        //1.定义爬取规则，字符串形式

        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|" +
                "(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //2.把爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //3.得到一个内容匹配器
        Matcher matcher = pattern.matcher(rs);

        //4.拿着matcher匹配器去rs当中找
        while(matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
