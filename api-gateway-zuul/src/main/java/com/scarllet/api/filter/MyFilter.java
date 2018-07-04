package com.scarllet.api.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");

//        String refer = request.getHeader("refer");
//        if (refer.equals("B服务")){
//            //放行
//        }


        if (accessToken != null) {
            //放行
            return null;
        }

        log.warn("token is empty");
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            //返回响应
            ctx.getResponse().getWriter().write("token is empty");
        } catch (Exception e) {
        }
        return null;

    }
}


