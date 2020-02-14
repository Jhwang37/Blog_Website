package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/github")
    public String github(){
        return "github";
    }

    @RequestMapping("/corejava")
    public String coreJava(){
        return "corejava";
    }
    @RequestMapping("/oopjava")
    public String oopJava(){
        return "oopjava";
    }
    @RequestMapping("/aboutme")
    public String aboutMe(){
        return "aboutme";
    }
    @RequestMapping("/aboutbootcamp")
    public String aboutbootcamp(){
        return "aboutbootcamp";
    }
    @RequestMapping("/contactme")
    public String contactme(){
        return "contactme";
    }
}

