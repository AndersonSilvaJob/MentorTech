package com.web.tornese.SpringWeb.models;

import javax.persistence.*;

@Entity
@Table(name = "Mentores")
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mentor")
  private int id;
  
  @Column(name = "nome_mentor")
  private String nomeMentor;

  @Column(name = "senha_mentor")
  private String senhaMentor;

  @Column(name = "email_mentor")
  private String emailMentor;

  @Column(name = "celular_mentor")
  private String celularMentor;

    

public int getId() {
    return id;
}

public String getEmailMentor() {
    return emailMentor;
}

public void setEmailMentor(String emailMentor) {
    this.emailMentor = emailMentor;
}

public String getSenhaMentor() {
    return senhaMentor;
}

public void setSenhaMentor(String senhaMentor) {
    this.senhaMentor = senhaMentor;
}

public String getNomeMentor() {
    return nomeMentor;
}

public void setNomeMentor(String nomeMentor) {
    this.nomeMentor = nomeMentor;
}

public String getCelularMentor() {
    return celularMentor;
}

public void setCelularMentor(String celularMentor) {
    this.celularMentor = celularMentor;
}

public void setId(int id) {
    this.id = id;
}
}
