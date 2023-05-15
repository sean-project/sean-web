package com.seanweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/vi/")
public class DemoController {
    @GetMapping("/health")
    @ResponseBody
    public String checkHealth() {
        return "356ms";
    }
}