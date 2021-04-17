package com.fw.javatest.apps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;

/**
 * 测试home
 * @author li
 */
@Controller
public class HomeController {


    @GetMapping("/home")
    @ResponseBody
    public String helloWorld() {
        return "hello,world " + Instant.now();
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        return "test1";
    }
}
