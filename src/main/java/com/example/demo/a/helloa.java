package com.example.demo.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@Controller
public class helloa {
    @GetMapping("/hell/{b}")
    public String Hello(@PathVariable("b") int b ,HttpSession session){
        session.setAttribute("a",b+"");
        return "helloa";
    }
}
