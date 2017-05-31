package com.gaussic.filter;




import com.avaje.ebean.Ebean;
import com.gaussic.model.UserEntity;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wxb on 2016/11/14.
 */
public class CharEncodingFilter implements Filter{
    String encoding;
    public void init(FilterConfig cfg) throws ServletException {
        String e=cfg.getInitParameter("encoding");
        if(e==null||"".equals(e.trim())){
            encoding="UTF-8";
        }else {
            encoding=e;
        }
//        Ebean.find(UserEntity.class).findRowCount();
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("---------------1------------------------");
//        System.out.println(request.toString());
        request.setCharacterEncoding(encoding);
        chain.doFilter(request,response);
//        System.out.println("---------------2------------------------");
//        System.out.println(response.toString());
    }

    public void destroy() {



    }
}
