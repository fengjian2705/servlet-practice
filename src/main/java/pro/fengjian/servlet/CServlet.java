package pro.fengjian.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CServlet 执行了...");

        /**
         * 1. 地址栏会发生改变
         * 2. 重定向是二次请求
         * 3. 重定向是客户端（浏览器）行为，可以跳转到外部资源
         * 4. 不能使用 request 域共享数据
         */
//        resp.setStatus(302);
//        resp.setHeader("Location","dServlet");
        resp.sendRedirect("dServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
