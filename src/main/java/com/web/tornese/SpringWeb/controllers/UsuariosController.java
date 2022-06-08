package com.web.tornese.SpringWeb.controllers;

import java.util.List;
import java.util.Optional;

import com.web.tornese.SpringWeb.models.Usuario;
import com.web.tornese.SpringWeb.repositorio.UsuariosRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuariosController {
    @Autowired
    private UsuariosRepo repo;

    @GetMapping("/cadastroUsuario")
    public String novousuario(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "site/cadastrarusuario";
    }

    @GetMapping("/usuarios")
    public String index(Model model){
      List<Usuario> usuarios = (List<Usuario>)repo.findAll();
      model.addAttribute("usuarios", usuarios);
      return "usuarios/usuario";
    }

    @GetMapping("/usuarios/agendamento")
    public String agendamento(Model model){
      List<Usuario> usuarios = (List<Usuario>)repo.findAll();
      model.addAttribute("usuarios", usuarios);
      return "usuarios/testeagendamento";
    }

    @PostMapping("/usuarios/criar")
    public String criar(Usuario usuario){
      repo.save(usuario);
      //return "redirect:/inicio";
      return "site/inicio";
    }
    
    @GetMapping("/usuarios/{id}")
    public String busca(@PathVariable int id, Model model){
      Optional<Usuario> admin = repo.findById(id);
      try{
        model.addAttribute("usuario", admin.get());
      }
      catch(Exception err){ return "redirect:/usuarios"; }
  
      return "usuarios/editarusuario";
    }

    @GetMapping("/usuariolistar/{id}")
    public String index(@PathVariable int id,Model model){
      Optional<Usuario> admin = repo.findById(id);
      
      List<Usuario> usuarios = (List<Usuario>)repo.findAll();
      model.addAttribute("usuario", usuarios);
      return "usuarios/editarusuario";
    }

    @GetMapping("/editarUsuario")
    public String editar(/*Model model*/){
     // List<Mentor> administradores = (List<Mentor>)repo.findAll();
   //   model.addAttribute("administradores", administradores);
      return "usuarios/editarusuario";
    }
}
