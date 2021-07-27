package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyxm
 * @date 2021/7/27 11:55 上午
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test git hub webhook!!!!!!!!! last!One";
    }
}
