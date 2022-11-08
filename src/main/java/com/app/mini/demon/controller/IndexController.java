package com.app.mini.demon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主页面
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
