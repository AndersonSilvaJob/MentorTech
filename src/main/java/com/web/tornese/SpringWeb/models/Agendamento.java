package com.web.tornese.SpringWeb.models;

import javax.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento")
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "horario")
  private String horario;

  @Column(name = "categoria")
  private String categoria;

  @Column(name = "valor")
  private String valor;
 
}
