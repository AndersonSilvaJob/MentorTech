package com.web.tornese.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
   
    @GetMapping("/iniciocadastro")
    public String inicio(){
      return "site/escolhacadastro";
    }
    
    @GetMapping("/iniciologin")
    public String iniciologin(){
      return "site/escolhalogin";
    }
}
