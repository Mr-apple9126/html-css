package org.example.springbootlearning;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestContoller {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        String method=request.getMethod();
        System.out.println("请求方式"+method);
        String uri=request.getRequestURI();
        System.out.println("URI地址"+uri);
        String protocol=request.getProtocol();
        System.out.println("请求协议"+protocol);
        String name=request.getParameter( "name" );
        String age=request.getParameter( "age" );
        System.out.println("name:"+name+",age:"+age);
        String accept = request.getHeader("accept");
        System.out.println(""+accept);
        return "OK";
    }
}
