package com.web.tornese.SpringWeb.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.web.tornese.SpringWeb.Servico.CookieService;
import com.web.tornese.SpringWeb.models.Administrador;
import com.web.tornese.SpringWeb.models.Mentor;
import com.web.tornese.SpringWeb.models.Usuario;
import com.web.tornese.SpringWeb.repositorio.AdministradoresRepo;
import com.web.tornese.SpringWeb.repositorio.MentoresRepo;
import com.web.tornese.SpringWeb.repositorio.UsuariosRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
  @Autowired
  private MentoresRepo repo;

  //@Autowired
  //private UsuariosRepo repositories;
 

  @GetMapping("/loginmentor")
  public String index(){
    return "login/loginmentor";
  }

  
  @PostMapping("/logar")
  public String logar(Model model, Mentor admParam, String lembrar, HttpServletResponse response) throws IOException{
    Mentor adm = this.repo.Login(admParam.getEmailMentor(), admParam.getSenhaMentor());
    if(adm != null){
      int tempoLogado = (60*60); // 1 hora de cookie
      if(lembrar != null) tempoLogado = (60*60*24*365); // 1 ano de cookie
      CookieService.setCookie(response, "usuarioId", String.valueOf(adm.getId()), tempoLogado);
      CookieService.setCookie(response, "nomeUsuario", String.valueOf(adm.getNomeMentor()), tempoLogado);
      return "redirect:/";
    }
    model.addAttribute("erro", "Usuário ou senha inválidos");
    return "login/index";
  }

  @GetMapping("/sair")
  public String logar(HttpServletResponse response) throws IOException{
    CookieService.setCookie(response, "usuarioId", "", 0);
    return "redirect:/login";
  }
}
