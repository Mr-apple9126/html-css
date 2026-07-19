package org.example.springbootlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/nihao")
    public String hello(String name){
    System.out.println("name"+name);
    return "Hello "+name;
    }
}