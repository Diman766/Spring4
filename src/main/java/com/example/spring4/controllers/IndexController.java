package com.example.spring4.controllers;

import com.example.spring4.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @PostMapping("/index")
    public String userAddFromPage(User user, Model model) {
        model.addAttribute("hello", user);
        return "hello";
    }

}
