package pro.fengjian.servlet;

import javax.servlet.*;
import java.io.IOException;

public class QuickServlet implements Servlet {

    /**
     * servlet 对象创建时，调用此方法完成初始化操作
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 用户访问 servlet 时，调用此方法，完成业务逻辑处理
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("hello, servlet !");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 当 servlet 销毁时，调用此方法完成销毁操作
     */
    @Override
    public void destroy() {

    }
}


