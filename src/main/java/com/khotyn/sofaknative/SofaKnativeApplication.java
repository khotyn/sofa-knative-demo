package com.khotyn.sofaknative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SofaKnativeApplication {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SofaKnativeApplication.class, args);
    }
}
