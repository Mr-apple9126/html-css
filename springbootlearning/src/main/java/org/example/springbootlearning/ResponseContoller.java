package org.example.springbootlearning;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseContoller {
    @RequestMapping("/response")
    public void setResponse(HttpServletResponse response)throws IOException {
//1设置响应状态码
        response.setStatus(401);
        response.setHeader("Content-Type","text/html;charset=utf-8");
        response.getWriter().write("响应结果");
    }
}
