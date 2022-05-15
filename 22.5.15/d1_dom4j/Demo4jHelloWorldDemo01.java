package io.delightedqian.d1_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Project Name: Demo4jHelloWorldDemo01
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/5/15
 * TIME:  11:03
 */
public class Demo4jHelloWorldDemo01 {
    @Test
    public void parseXMLData() throws Exception {
//      1 创建一个Demo4j的解析对象，代表了整个demo4j框架
        SAXReader saxReader = new SAXReader();
//      2 把XML文件加载带内存中称为一个Document文档对象
        //Document document = saxReader.read(new File("xml-app\\src\\Contacts.xml"));
        //Document document = saxReader.read(new FileInputStream("xml-app\\src\\Contacts.xml"));

//      注意  getResourceAsStream中的/时直接去sec寻找文件
        InputStream is = Demo4jHelloWorldDemo01.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);
//      3 获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());
//      4 拿根元素下的全部子元素对象（一级）
        List<Element> sonEles = root.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }
//      拿某个子元素
        Element userEle = root.element("user");
        System.out.println(userEle.getName());
//      如果有多个相同的元素，默认提取第一个子元素对象
        Element contact = root.element("contact");
        System.out.println(contact.elementText("name"));
//       获取当前元素下的子元素对象
        Element email = contact.element("email");
        System.out.println(email.getText());
//      根据元素获取属性值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName()+"--------->"+idAttr.getValue());
//      直接提取属性值
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));

    }
}
