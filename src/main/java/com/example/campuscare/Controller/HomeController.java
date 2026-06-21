package com.example.campuscare.Controller;

import com.example.campuscare.Entity.User;
import com.example.campuscare.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;



    @GetMapping("/")
    public String homePage() {
        return "home";
    }





}