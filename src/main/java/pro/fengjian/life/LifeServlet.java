package pro.fengjian.life;

import javax.servlet.*;
import java.io.IOException;

public class LifeServlet implements Servlet {

    /**
     * 首次访问时创建，单例
     * 弊端：创建需要时间，体验不好
     * 解决：
     * 1. <load-on-startup>4</load-on-startup> 服务器启动时，初始化标签
     * 2. 标签内部数值大于 0 的数，建议 4 ，1~3 被 web.xml 占用了
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("LifeServlet 的 init 方法执行了，该对象被创建完成了 !");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 每次访问时执行
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("LifeServlet 的 service 方法执行了，执行了具体的业务逻辑 !");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 服务器关闭时执行
     */
    @Override
    public void destroy() {
        System.out.println("LifeServlet 的 destroy 方法执行了，该对象被销毁了 !");

    }
}
