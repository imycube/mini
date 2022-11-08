package com.app.mini.demon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/echarts")
public class EchartsController {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String index() {
        return "echarts";
    }
}
