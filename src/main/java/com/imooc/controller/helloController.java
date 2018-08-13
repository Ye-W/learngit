package com.imooc.controller;


import com.imooc.pojo.ImoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController
{
    @Autowired
    private Resource resource;
    @RequestMapping("/hello")
    public Object hello(){
      return "hello springboot";

    }
    @RequestMapping("/getResource")
    public ImoocJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return null;
    }
}
