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
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1获取Documenr对象 根据xml文档获取
        //1.1获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //1.2解析xml文档 加载文档进内存
        Document document = Jsoup.parse(new File(path), "utf-8");
        //2.获取元素对象
        Elements elements = document.getElementsByTag("name");
        //2.1获取第一个name的Element对象
        Element element = elements.get(0);
        //2.2获取数据
        String name = element.text();
        System.out.println(name);
    }
}
