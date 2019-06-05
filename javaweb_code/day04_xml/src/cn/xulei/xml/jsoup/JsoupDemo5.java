package cn.xulei.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup解析xml
 */
public class JsoupDemo5 {
    public static void main(String[] args) throws IOException {
        //1.1获取student.xml的path
        String path = JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        //1.2解析xml文档 加载文档进内存
        Document document = Jsoup.parse(new File(path), "utf-8");

        //2.查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("-----------------");
        //3.查询id为itcast的元素
        Elements elements1 = document.select("#itcast");
        System.out.println(elements1);
        System.out.println("-----------------");
        //4.获取student标签并且number属性值为s001的age子标签
        //4.1获取student标签并且number属性值为s001
        Elements elements2 = document.select("student[number='s001'] > age");
        System.out.println(elements2);
    }
}
