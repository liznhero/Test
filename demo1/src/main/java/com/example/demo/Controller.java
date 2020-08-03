package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lizhennan
 * @version 1.0
 * @describe
 * @date 2020/8/3
 */

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("index")
    @ResponseBody
    public String test1(){
        return "hello spingboot idea";
    }
}
