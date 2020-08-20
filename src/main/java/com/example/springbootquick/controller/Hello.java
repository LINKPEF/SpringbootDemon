package com.example.springbootquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
//@ResponseBody
//@RestController
public class Hello {
  //  @ResponseBody
//    @RequestMapping("/")
//    public String hello() {
//        return "index";
//    }
   // @ResponseBody

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","jj");
        return "success";
    }
}
