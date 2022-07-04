package pro.fengjian.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("AServlet 中的功能下执行了...");
        /**
         * 请求转发：
         * 1. 浏览器发生了一次请求
         * 2. 地址栏没有发生改变
         * 3. 只能转发到服务器内部资源
         */
        req.setAttribute("username","jack");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bServlet");
        requestDispatcher.forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
