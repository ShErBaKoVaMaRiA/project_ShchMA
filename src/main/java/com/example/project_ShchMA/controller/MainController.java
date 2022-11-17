package com.example.project_ShchMA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home_page(){
        return "home";
    }
    @PostMapping("/info")
    public String info_page(@RequestParam (name="login",required = false, defaultValue="Привет")String login,@RequestParam (name="password",required = false, defaultValue="Привет")String password,@RequestParam (name="par",required = false, defaultValue="Привет")String par, Model model){
        model.addAttribute("temp", login);
        model.addAttribute("description",password);
        model.addAttribute("par",par);
        //System.out.println(model);
        return "about";
    }
}

