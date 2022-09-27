package cn.jiyun.shop.filter;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.lang.model.element.VariableElement;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * ClassName: MyFilter
 * Author:   WGG
 * Date:    2022-09-2022/9/27-16:46
 * Version: 1.0
 * Description:
 */
@Slf4j
@WebFilter(filterName = "MyFilter",urlPatterns = "/*")
public class MyFilter implements Filter {

    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取请求uri
        System.out.println("到这了，到这了，到这了");
        String requestURI = request.getRequestURI();
        log.info("拦截到请求：{}",requestURI);
        //定义不需要处理请求路径
        String[] urls = new String[]{
                /*
                * 定义不需要处理请求路径
                * 如：controller/login
                * */
        };
        boolean check = check(urls,requestURI);
        if (check){
            log.info("本次请求不用处理：{}",requestURI);
            filterChain.doFilter(request,response);
            return;
        }
        //判断登录状态
        if(request.getSession().getAttribute("登录后保存session")!=null){
            log.info("用户已登录，用户ID为：{}",request.getSession().getAttribute("登录后保存session"));
            filterChain.doFilter(request,response);
            return;
        }
        //还未登录通过输出流，返回NOTLOGIN信息，前端响应拦截器进行页面跳转
        log.info("用户未登录！");
        //
        return;
    }

    private boolean check(String[] urls, String requestURI) {

        for (String url : urls) {

        }
        return true;
    }

    @Override
    public void destroy() {

    }
}
