package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class hello {
    @GetMapping("/hello/{b}")
    public String Hello(@PathVariable("b") int b ,HttpSession session){
        session.setAttribute("a",b+"");
        System.out.print(111);
        System.out.println(222);
        return "hello";
    }
}
