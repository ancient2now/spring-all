package com.akikun.springboot.web;

import com.akikun.springboot.exception.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/404.html")
    public String notFound() throws Exception{
        throw new NotFoundException("Not Found. 404");
    }


}
