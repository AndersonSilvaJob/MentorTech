package com.web.tornese.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/iniciopoliticapriv")
    public String politicaPriv() {
        return "site/politicapriv";
    }

    @GetMapping("/iniciosobre")
    public String sobre() {
        return "site/sobre";
    }

}
