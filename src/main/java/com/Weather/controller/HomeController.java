package com.Weather.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String test(Model m)
    {
        m.addAttribute("search Weather","home-smart contact manager");
        return "Normal/Search";
    }
}
