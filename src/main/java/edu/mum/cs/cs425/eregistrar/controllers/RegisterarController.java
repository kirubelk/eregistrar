package edu.mum.cs.cs425.eregistrar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterarController {
    
    @GetMapping(value = {"/","/eregistrar"})
    public String displayRegister(){
        return "home/index";
    }

}