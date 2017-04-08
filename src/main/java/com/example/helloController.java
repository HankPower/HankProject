package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;


/**
 * Created by Administrator on 2017-03-25.
 */
@RestController
@RequestMapping(value = "/index")
public class helloController {


    @RequestMapping
    public String  index()
    {

        return "hello world";
    }
    //RequestParam 简单绑定
    @RequestMapping(value = "/get")
    public HashMap<String,Object> get (@RequestParam String name )
    {
        HashMap<String,Object> map =new HashMap<String,Object>();
        map.put("title","hello world");
        map.put("name",name);
        return map;
    }
    //@PathVariable 获得url动态请求s
    @RequestMapping(value = "get/{id}/{name}")
    public User getUser(@PathVariable int id ,@PathVariable String name )
    {
       User user=new User();
       user.setId(id);
       user.setName(name);
       user.setDate(new Date());
       return user;

    }
}
