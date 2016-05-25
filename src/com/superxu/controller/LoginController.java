package com.superxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/user")  
    public String loginView() {  
       System.out.println("ssssssss"); 
        return "/login/login";  
    }  
}
