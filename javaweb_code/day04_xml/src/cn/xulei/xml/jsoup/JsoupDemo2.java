package cn.xulei.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup三种方式解析xml
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //1获取Documenr对象 根据xml文档获取
        //1.1获取student.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        //1.2解析xml文档 加载文档进内存
        //Document document = Jsoup.parse(new File(path), "utf-8");

        //2.parse(String html),解析xml
        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\t<student number=\"s001\">\n" +
                "\t\t<name>zhangsan</name>\n" +
                "\t\t<age>22</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "\t<student number=\"s002\">\n" +
                "\t\t<name>lisi</name>\n" +
                "\t\t<age>24</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "</students>";

        Document document = Jsoup.parse(str);
        System.out.println(document);*/

        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://start.firefoxchina.cn/");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
    }
}
