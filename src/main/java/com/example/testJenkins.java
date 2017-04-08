package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-04-08.
 */
@RestController
public class testJenkins {
    @RequestMapping("/hello")
    public String helloworld()
    {
        return  "hello";
    }
}
