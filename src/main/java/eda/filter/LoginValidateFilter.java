package eda.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import eda.utils.ResponseEntity;
import eda.utils.Token;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description
 * @Author XXXXX
 * @Date 2021/9/6 11:25
 */
@WebFilter("/orders/*")
public class LoginValidateFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req0, ServletResponse resp0, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) req0;
        HttpServletResponse resp = (HttpServletResponse) resp0;

        String tokenString = req.getHeader("token");
        Token token = null;

        if (tokenString != null){
            token = (Token) req.getServletContext().getAttribute(tokenString);
        }

        if (token == null || token.getLogin() == false){
            //如果没有登录
            PrintWriter out = resp.getWriter();

            ResponseEntity<String> responseEntity = new ResponseEntity<>();
            responseEntity.setCode(1001);
            responseEntity.setMessage("用户登录认证失败");
            responseEntity.setData("");

//            转换成json字符串传过去
            ObjectMapper mapper=  new ObjectMapper();
            String responseString = mapper.writeValueAsString(responseEntity);
            out.write(responseString);
            out.close();
        }else {
            //登录，允许访问
            chain.doFilter(req,resp);
        }
    }

    @Override
    public void destroy() {

    }
}
