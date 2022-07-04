package pro.fengjian.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class ServletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("gbk");
        System.out.println("---------------------请求行");
        System.out.println("请求方式: " + req.getMethod());
        System.out.println("虚拟路径: " + req.getContextPath());
        System.out.println("请求 url: " + req.getRequestURL());
        System.out.println("请求协议和版本号: " + req.getProtocol());
        System.out.println("请求 IP: " + req.getRemoteAddr());

        System.out.println("-------------------请求头");
        System.out.println("Host: " + req.getHeader("host"));
        System.out.println("所有请求头: ");
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        System.out.println("-----------------请求体");
        System.out.println("getParameter: " + req.getParameter("name"));
        System.out.println("getParameters: " );
        for (String name : req.getParameterValues("name")) {
            System.out.print(name);
        }
        System.out.println();
        System.out.println("getParameterMap: ");
        Map<String,Object>parameterMap = req.getParameterMap();
        for (Map.Entry<String, Object> stringStringEntry : parameterMap.entrySet()) {
            System.out.println(stringStringEntry.getKey()+" : "+stringStringEntry.getValue());
        }

        System.out.println("--------------响应行");
        resp.setStatus(404);

        System.out.println("--------------响应头");
        resp.setHeader("abc","jack");

        System.out.println("--------------响应体");
        resp.getWriter().write("好好学习");
//          resp.getOutputStream().print(1);
//          resp.getOutputStream().print(1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost...");
        req.setCharacterEncoding("utf-8");
        doGet(req,resp);
    }
}
