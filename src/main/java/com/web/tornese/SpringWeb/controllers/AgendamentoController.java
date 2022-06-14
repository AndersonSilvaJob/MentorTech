package com.web.tornese.SpringWeb.controllers;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import com.web.tornese.SpringWeb.models.Agendamento;
import com.web.tornese.SpringWeb.repositorio.AgendamentosRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AgendamentoController {

    @Autowired
    private AgendamentosRepo repo;

    @PostMapping("/criaragendamento")
    public String criar(Agendamento agendamento){
      repo.save(agendamento);
      //return "redirect:/inicio";
      return "/home/index";
    }

    @GetMapping("/agendarmentoria")
    public String agendar(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "/usuarios/agendarmentoria";
    }
    
    
}
