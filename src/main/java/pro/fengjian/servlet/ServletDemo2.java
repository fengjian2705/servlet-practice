package pro.fengjian.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("---------------------请求行");
        System.out.println("请求方式: "+ req.getMethod());
        System.out.println("虚拟路径: "+ req.getContextPath());
        System.out.println("请求 url: "+req.getRequestURL());
        System.out.println("请求协议和版本号: "+ req.getProtocol());
        System.out.println("请求 IP: "+req.getRemoteAddr());

        System.out.println("-------------------请求头");
        System.out.println("Host: "+ req.getHeader("host"));
        System.out.println("所有请求头: ");
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost...");
    }
}
