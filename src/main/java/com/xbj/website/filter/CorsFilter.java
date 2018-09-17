//package com.xbj.website.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///** 
// * @Description 部署服务器时，跨域处理
// * @ClassName CorsFilter 
// * @Title CorsFilter.java 
// * @Package com.xbj.website.filter
// * @author binjie.xu
// * @E-mail binjie.xu@baozun.com  
// * @version 创建时间：2018年9月3日 下午5:13:48   
// */
//@Component
//public class CorsFilter implements Filter {
//    /**
//     * json web token 在请求头的名字
//     */
//    private String tokenHeader = "X_Auth_Token";
//    
//    private static final Logger LOGGER = LoggerFactory.getLogger(CorsFilter.class);
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse) res;
//        HttpServletRequest request = (HttpServletRequest) req;
//        String token = request.getHeader("X_Auth_Token");
//        LOGGER.info("token " + token);
//        String Origin = request.getHeader("Origin");
//        LOGGER.info("tokenHeader: " + this.tokenHeader);
//       
//        LOGGER.info("Origin: " + Origin);
//        response.setHeader("Access-Control-Allow-Origin", Origin);
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, " + this.tokenHeader);
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        chain.doFilter(req, res);
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    	LOGGER.info(this.getClass()+"init !");
//    }
//
//    @Override
//    public void destroy() {
//    	LOGGER.info(this.getClass()+"destroy!");
//    }
//}
