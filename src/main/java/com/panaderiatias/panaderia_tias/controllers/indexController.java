package com.panaderiatias.panaderia_tias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/home")
    public String welcome(){
        return "index";
    }
}
