package cn.xulei.web.download;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        //1.使用字节输入流加载文件进内存
        //1.1找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        //1.2使用字节流关联
        FileInputStream fis = new FileInputStream(realPath);

        //2.设置response响应头
        //2.1设置响应头类型
        String mimeType = servletContext.getMimeType(filename);//获取文件的mime
        response.setHeader("content-type",mimeType);
        //2.2设置响应头打开方式
        response.setHeader("content-disposition","attachment;filename="+filename);
        //3.将输入流的数据写到输出流中
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] buff = new byte[1024];
        int len = 0;
        while((len = fis.read(buff)) != -1)
        {
            outputStream.write(buff,0,len);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
