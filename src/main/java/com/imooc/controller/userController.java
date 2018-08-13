package com.imooc.controller;


import com.imooc.pojo.ImoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
//@RestController = Controller + ResponseBody
@Controller
@RequestMapping("/user")
public class userController
{
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        User u = new User();
        u.setName("imooc666");
        u.setPassword(123456);
        u.setBirthday(new Date());
        u.setDesc("hello imooc");
        return u;

    }

}
