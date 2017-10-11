package cn.easyproject.easyee.sh.base.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/10/10.
 *
 * 通过注解的方式加入过滤器
 *
 */
@WebFilter(filterName="ConsoleCodeAssist",urlPatterns="/*")
public class ConsoleCodeAssist implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
