package com.my131.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")   //주소 경로
    public String hello() {
        return "hello";     //template 폴더 html 이름
    }

    @GetMapping("/hello")   //주소 경로
    public String hello1() {
        return "hello";     //template 폴더 html 이름
    }

}
