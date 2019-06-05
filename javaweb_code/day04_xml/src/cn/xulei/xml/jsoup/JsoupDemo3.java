package cn.xulei.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document/Element对象功能
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        //1获取student.xml的path
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        //2获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取属性名为id的元素对象
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("---------------");
       //获取number属性值为s001的对象
        Elements elements2 = document.getElementsByAttributeValue("number", "s001");
        System.out.println(elements2);
        System.out.println("---------------");
        //获取id属性值的对象
        Element element = document.getElementById("itcast");
        System.out.println(element);
    }
}
