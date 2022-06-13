package com.web.tornese.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class politicaPrivController {
    
    @GetMapping(value="/politicaPriv")
    public String politicaPriv() {
        return "site/politicaPriv";
    }
    
}
