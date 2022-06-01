package com.web.tornese.SpringWeb.controllers;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import com.web.tornese.SpringWeb.models.Mentor;
import com.web.tornese.SpringWeb.repositorio.MentoresRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MentorController {
    @Autowired
    private MentoresRepo repo;
  
    @GetMapping("/inicio")
    public String index(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "site/inicio";
    }

    @GetMapping("/cadastroMentor")
    public String novomentor(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "site/cadastrarmentor";
    }

    @PostMapping("/mentores/criar")
    public String criar(Mentor mentor){
      repo.save(mentor);
      //return "redirect:/inicio";
      return "site/inicio";
    }


    @GetMapping("/mentoreslistar/{id}")
    public String index(@PathVariable int id,Model model){
      Optional<Mentor> admin = repo.findById(id);
      
      List<Mentor> mentores = (List<Mentor>)repo.findAll();
      model.addAttribute("mentores", mentores);
      return "mentores/listarmentores";
    }

    /*@PostMapping("/mentores/{id}/atualizar")
  public String atualizar(@PathVariable int id, Mentor mentor){
    // if(!repo.exist(id)){
    if(!repo.existsById(id)){
      return "mentores/editarmentor";
    }*/
    
    @GetMapping("/mentores/{id}")
    public String busca(@PathVariable int id, Model model){
      Optional<Mentor> admin = repo.findById(id);

      try{
        model.addAttribute("mentor", admin.get());
      }
      catch(Exception err){ return "redirect:/mentores"; }
  
      return "/mentores/editarmentor";
    }
    
    @PostMapping("/mentores/{id}/atualizar")
    public String atualizar(@PathVariable int id, Mentor mentor){
      // if(!repo.exist(id)){
      if(!repo.existsById(id)){
        return "redirect:/mentores/{id}";
      }
  
      repo.save(mentor);
  
      return "redirect:/mentores/{id}";
    }
  

    @GetMapping("/editarmentor")
    public String editar(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "/mentores/editarmentor";
    }

}
